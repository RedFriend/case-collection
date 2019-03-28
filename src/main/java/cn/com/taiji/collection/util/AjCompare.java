package cn.com.taiji.collection.util;

import com.taiji.common.util.CommonUtil;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Think on 2018/5/18.
 */
public class AjCompare<T>{


    public T compare(T a1,T a2) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IntrospectionException {
        Field[] fields2 = a2.getClass().getDeclaredFields();
        for(int i=0;i<fields2.length;i++){
            String name = fields2[i].getName();    //获取属性的名字
            PropertyDescriptor pd = new PropertyDescriptor(name, a2.getClass());

            Method m2 = pd.getReadMethod();
            Object value = m2.invoke(a2);

            if(CommonUtil.isNull(value)){
                continue;
            }

            //获得set方法
            Method m1 = pd.getWriteMethod();
            m1.invoke(a1, value);
        }
        return a1;
    }

    public List<T> selectAjPerson(String key,List<T> list) throws Exception{
        if(CommonUtil.isNull(list)){
            return new ArrayList<>();
        }

        T t=list.get(0);
        Field field=t.getClass().getDeclaredField(key);
        PropertyDescriptor pd = new PropertyDescriptor(field.getName(), t.getClass());
        Method m2 = pd.getReadMethod();
        Object mc = m2.invoke(t);


        List<T> resultList=new ArrayList<>();
        T a1= (T) Class.forName(t.getClass().toString()).newInstance();
        for(T ajPerson:list ){

            Object dsrmc=m2.invoke(ajPerson);
            if(!mc.equals(dsrmc)){
                a1=(T) Class.forName(t.getClass().toString()).newInstance();
                mc=dsrmc;
            }

            try {
                AjCompare<T> ajCompare=new AjCompare<>();
                a1=ajCompare.compare(a1,ajPerson);
            } catch (Exception e) {
                continue;
            }
            if(resultList.contains(a1)){
                resultList.remove(a1);
            }
            resultList.add(a1);
        }


        return resultList;
    }
}
