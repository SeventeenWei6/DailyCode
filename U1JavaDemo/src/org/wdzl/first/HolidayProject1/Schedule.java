package org.wdzl.first.HolidayProject1;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* 放映计划类
* */
public class Schedule {
    List<Scheduleltem> ShowList = new ArrayList<Scheduleltem>();
    public List loadItems(String filename) {
        String test;
        int k;
        List<String> list1 ;
        File inputXML = new File(filename);
        //创建SAXReader,用于读取xml文件
        SAXReader saxReader = new SAXReader();
        try {
            org.dom4j.Document document = saxReader.read(inputXML);
            //获取根元素
            org.dom4j.Element root = document.getRootElement();
            //获取根元素下子元素
            Iterator<Element> it = root.elementIterator();
            while (it.hasNext()) {
                //每次遍历取出元素
                org.dom4j.Element e = it.next();
                //获取子元素
                Element name = e.element("Name");
                Element Poster = e.element("Poster");
                Element Actor = e.element("Actor");
                Element Director = e.element("Director");
                Element Price = e.element("Price");
                Element Schedule = e.element("Schedule");
                Element type = e.element("Type");
                //遍历时间元素
                Iterator it1 = Schedule.elementIterator();
                while (it1.hasNext()) {
                    Scheduleltem sd = new Scheduleltem();
                    Movie m = new Movie();
                    //获取时间点每一个元素
                    Element item = (Element) it1.next();
                    m.setName(name.getStringValue());
                    m.setEname(Poster.getStringValue());
                    m.setDirector(Director.getStringValue());
                    m.setActor(Actor.getStringValue());
                    m.setType(type.getStringValue());
                    int a = Integer.parseInt(Price.getStringValue());
                    m.setPrice(a);
                    //把m添加到Scheduleltem类
                    sd.setMovie(m);
                    //把时间添加到Scheduleltem类
                    sd.setTime(item.getStringValue());
                    //把Scheduleltem类添加到集合中
                    ShowList.add(sd);
                }
            }
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int i= 0;

        Iterator<Scheduleltem> ite = ShowList.iterator();
        while(ite.hasNext())
        {
            i++;
            Scheduleltem sch = ite.next();
            System.out.println(i+"\t\t"+sch.getMovie().getName()+"\t\t"+sch.getMovie().getEname()+"\t\t"+sch.getMovie().getDirector()+"\t\t"+sch.getMovie().getActor()+"\t\t"+sch.getMovie().getType()+"\t\t"+sch.getMovie().getPrice()+"\t\t"+sch.getTime());
           String s = sch.getTime();
           //由于txt文件不能有:所以将:替换掉
           char [] temp =s.toCharArray();//String 转化为char 数组
            for (int j = 0; j <temp.length ; j++) {
                if(temp[j]==':')
                {
                    temp[j] = '-';
                }
            }
            String s1 = String.valueOf(temp);//char数组转化为String类型
            //每个场次建立座位表信息
            File f = new File("F:\\"+sch.getMovie().getName()+"_"+s1+".txt");

            Seat seat = new Seat();
            list1 = seat.seaT();
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(f));
                for (String l:list1){
                    writer.write(l);
                    writer.write("\r\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

//            List<String> list3 = new ArrayList<>();
//            try {
//                BufferedReader br = new BufferedReader(new FileReader(f));
//                String p;
//                while((p = br.readLine())!=null)
//                {
//                    list3.add(p);
//                }
//                br.close();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            System.out.println(list3.get(20));
       }
        return  ShowList;
    }




}



class  t{
    public static void main(String[] args) {
        Schedule e = new Schedule();
        e.loadItems("aaa.xml");
    }
}
