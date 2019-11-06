package org.wdzl.first.HolidayTwelve;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo1_DomTest implements Demo1_XMLDocument{
   private Document document;
   private  String filename;
   public  void init()
   {

       try {
           //初始化方法，获得解析器工厂对象
           DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
           //由解析器工厂对象factory创建解析器对象
           DocumentBuilder builder = factory.newDocumentBuilder();
           //由解析器对象builder创建document对象
           this.document = builder.newDocument();

       } catch (ParserConfigurationException e) {
           e.printStackTrace();
       }

   }

    @Override
    public void createXml(String filename) {
        //创建xml文档
        //创建根元素
        Element root =this.document.createElement("employees");
        //文档拼接元素
        this.document.appendChild(root);
        //创建根元素子元素
        Element employee = this.document.createElement("employee");
        //创建叶子元素
        Element name = this.document.createElement("name");
        //新增叶子元素的内容
        name.appendChild(this.document.createTextNode("张三"));
        //把叶子元素添加到其父元素中
        employee.appendChild(name);

        Element sex = this.document.createElement("sex");
        sex.appendChild(this.document.createTextNode("m"));
        employee.appendChild(sex);

        Element age = this.document.createElement("age");
        age.appendChild(this.document.createTextNode("20"));
        employee.appendChild(age);

//        root.appendChild(employee);//把根元素的子元素添加到根元素中
//
//        //保存XML文档:通过转化器,把内存中DOM树模型，转存到物理路径上
//        //创建转化器工厂
//        TransformerFactory tf  = TransformerFactory.newInstance();
//        try {
//            //由转换器工厂对象tf创建转换器对象
//            Transformer transformer = tf.newTransformer();
//            //创建文档资源对象
//            DOMSource source = new DOMSource(document);
//            //设置物理模型的属性(编码方式,缩进:yes/缩进)
//            transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
//            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
//            //通过输出流把内存中DOM树模型输出
//            PrintWriter pw = new PrintWriter(new FileOutputStream(filename));
//            StreamResult result = new StreamResult(pw);
//            //转换器转换相关数据
//            transformer.transform(source,result);
//            System.out.println("创建XML文件成功");
//        } catch (TransformerConfigurationException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (TransformerException e) {
//            e.printStackTrace();
//        }
//
    }

    @Override
    public void parseXml(String filename) {
        //解析xml文档
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db;
        try {
            db = dbf.newDocumentBuilder();
            Document document = db.parse(filename);
            NodeList employees = document.getChildNodes();


            for (int i = 0; i <employees.getLength() ; i++) {
                System.out.println(i+"-i");
                Node employee  = employees.item(i);
                NodeList employeeInfo = employee.getChildNodes();

                for (int j = 0; j <employeeInfo.getLength(); j++) {
                    System.out.println(j+"-j");
                    //System.out.println(employeeInfo.item(j).getNodeName()+"----"+employeeInfo.item(j).getNodeName());
                    Node node = employeeInfo.item(j);
                    NodeList employeeMata = node.getChildNodes();

                    for (int k = 0;k <employeeMata.getLength() ; k++) {
                        System.out.println(k+"-k");
                        System.out.println(employeeMata.item(k).getNodeName()+"-----"+employeeMata.item(k).getTextContent());
                    }
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        List<String> test = new ArrayList<>();
//        File inputXML = new File(filename);
//        SAXReader saxReader = new SAXReader();
//        try {
//            org.dom4j.Document document = saxReader.read(inputXML);
//            org.dom4j.Element employees = document.getRootElement();
//            for (Iterator it = employees.elementIterator(); it.hasNext();) {
//                org.dom4j.Element employee = (org.dom4j.Element) it.next();
//                for (Iterator i= employee.elementIterator(); i.hasNext();) {
//                    org.dom4j.Element node = (org.dom4j.Element) i.next();
//
//                    System.out.println(node.getName()+"----"+node.getStringValue());
//                    test.add(node.getStringValue());
//                }
//                String temp1 = test.get(0);
//                String temp2 = test.get(1);
//                String temp3 = test.get(2);
//                String temp4 = test.get(3);
//                String temp5 = test.get(4);
//                String temp6 = test.get(5);
//                String temp7 = test.get(6);
//
//
//                System.out.println("信息:"+temp1+temp2+temp3+temp4+temp5+temp6+temp7);
//                test.clear();
//            }
//            System.out.println("ok");
//        } catch (DocumentException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
    }

    public static void main(String[] args) throws IOException {
        Demo1_DomTest dd = new Demo1_DomTest();
        dd.init();
//        dd.createXml("emp.xml");
        dd.parseXml("aaa.xml");
//        List<String> list = new ArrayList<>();
//
//        String filename = "F:\\完美世界_啊啊.txt";
//        System.out.println(filename);
//           File file = new File(filename);
//           if(!file.exists())
//           {
//               file.createNewFile();
//           }
//        FileWriter fw = new FileWriter(filename);
//        fw.write("***************");
//        fw.write("\r\n");
//        fw.write("\t恒智影院");
//        fw.write("\r\n");
//        fw.write("---------------------------");
//        fw.close();
//        String name = "4-7";
//        int i = Integer.parseInt(name);
//        System.out.println(i);

    }
}
