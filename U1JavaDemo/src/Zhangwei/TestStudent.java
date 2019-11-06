package Zhangwei;


import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestStudent {
    public static  String getString() throws IOException {
        Scanner input = new Scanner(System.in);
        String temp = null;
        temp = input.next();
        return temp;
    }
    public  static int getAge()throws IOException{
        int temp = 0;
        String str = null;
        boolean flag = true;
        while(flag){
            str = TestStudent.getString();
            if(str.matches("^\\d{1,3}+$"))
            {
                temp = Integer.parseInt(str);
                flag = false;
            }
            else
            {
                System.out.println("输入的必须是数字，请重新输入...");
            }
        }
        return temp;
    }
    public  static void add(ArrayList array,File f)throws IOException
    {
        ObjectOutputStream op = new ObjectOutputStream(new FileOutputStream(f));//

        Scanner i = new Scanner(System.in);
        System.out.print("请输入学号:");
        String  id = i.next();
        System.out.print("请输入姓名:");
        String  name = i.next();
        System.out.print("请输入年龄:");
        int age = TestStudent.getAge();
        StudentManage stu = new StudentManage(id,name,age);
        array.add(stu);
        op.writeObject(array);//
        System.out.println("添加成功!");
        return;
    }
    public  static void findAll(ArrayList array)
    {
        Iterator<StudentManage> it = array.iterator();
        while(it.hasNext())
        {
            StudentManage temp = it.next();
            System.out.println(temp.getID()+"\t\t\t"+temp.getName()+"\t\t\t"+temp.getAge());

        }
        return;
    }
    public  static  void findSomeone(ArrayList array, String ID)
    {
        Iterator<StudentManage> it = array.iterator();
        while (it.hasNext())
        {
            StudentManage temp = it.next();
            if(temp.getID().equals(ID))
            {
                System.out.println(temp.getID()+"\t\t\t"+temp.getName()+"\t\t\t"+temp.getAge());
                break;
            }
        }
        return;
    }
    public  static  void ChangeStudent(ArrayList array,String id)throws IOException
    {
        Iterator<StudentManage> it = array.iterator();
        while (it.hasNext())
        {
            StudentManage temp = it.next();
            if(temp.getID().equals(id))
            {
                Scanner i = new Scanner(System.in);
                System.out.print("请输入学号:");
                String  ID = i.next();
                System.out.print("请输入姓名:");
                String  name = i.next();
                System.out.print("请输入年龄:");
                int age = TestStudent.getAge();
                System.out.println("确认修改吗? Y-yes N-no");
                String in = i.next();
                if(in.equals("Y"))
                {
                    temp.setName(name);
                    temp.setAge(age);
                    temp.setID(ID);
                    System.out.println("修改成功!");
                    break;
                }
                else
                {
                    break;
                }
            }
        }
        return;
    }
    public  static void Delete(ArrayList array,String id)
    {
        Scanner i = new Scanner(System.in);
        Iterator<StudentManage> it = array.iterator();
        while (it.hasNext())
        {
            StudentManage temp = it.next();
            if(temp.getID().equals(id))
            {
                System.out.println("确认删除吗? Y-yes N-no");
                String in = i.next();
                if(in.equals("Y"))
                {
                    array.remove(temp);
                    System.out.println("删除成功!");
                    break;
                }
                else
                {
                    break;
                }

            }
        }
        return;
    }
    public static void Writer(ArrayList array,File f) {
        FileWriter fw = null;
        try {

            fw = new FileWriter(f);
            Iterator<StudentManage> it = array.iterator();
            while (it.hasNext()) {
                StudentManage temp = it.next();
                fw.write(temp.getID()+"\t\r");
                fw.write(temp.getName()+"\t\r");
                fw.write(temp.getAge()+"\r\n");
            }
            System.out.println("保存成功!");
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
      File f = new File("F:\\stu.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        Scanner input = new Scanner(System.in);
        int choice;
        int flag = 0;
        ArrayList<StudentManage> array = new ArrayList<StudentManage>();
        do {

            System.out.println("**********");
            System.out.println("学生管理系统");
            System.out.println("**********");
            System.out.println("1--添加学生信息");
            System.out.println("2--查询学生信息");
            System.out.println("3--修改学生信息");
            System.out.println("4--删除学生信息");
            System.out.println("5--保存文件");
            System.out.println("6--退出系统");
            System.out.print("请选择:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    add(array,f);
                    System.out.println("按0返回！");
                    flag = input.nextInt();
                    break;
                case 2:
                    System.out.println("1--查询所有 2--按照学号查询");
                    int k = input.nextInt();
                    if (k == 1) {
                        findAll(array);
                        System.out.println("按0返回！");
                        flag = input.nextInt();
                        break;
                    } else {
                        System.out.print("请输入学号:");
                        String ID = input.next();
                        findSomeone(array, ID);
                        System.out.println("按0返回！");
                        flag = input.nextInt();
                        break;
                    }
                case 3:
                    System.out.print("请输入你要修改学号:");
                    String ID = input.next();
                    ChangeStudent(array, ID);
                    System.out.println("按0返回！");
                    flag = input.nextInt();
                    break;
                case 4:
                    System.out.print("请输入你要修改学号:");
                    String in = input.next();
                    Delete(array, in);
                    System.out.println("按0返回！");
                    flag = input.nextInt();
                    break;
                case 5:
                    Writer(array,f);
                    System.out.println("按0返回！");
                    flag = input.nextInt();
                    break;
                case 6:
                    flag = 1;
                    break;
                default:
                        break;
            }

        } while (flag==0);
    }
}
