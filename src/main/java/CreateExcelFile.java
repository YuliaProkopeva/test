
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


import java.io.*;

import java.util.*;



public class CreateExcelFile {
    public static void main(String[] args) throws IOException {


        String file = "C://Users/y.prokopyeva/IdeaProjects/test/src/main/resources/NameMale.txt";    // задаем имя файла
        List<String> wordsList = new ArrayList<>();        //  коллекция слов

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(file)));
            String read;
            while ((read = br.readLine()) != null) {
                wordsList.add(read);               // читаем все слова из файла и добавляем в коллекцию
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("I/O error.");
        }


        String file1 = "C://Users/y.prokopyeva/IdeaProjects/test/src/main/resources/SurnameMale.txt";// задаем имя файла
        List<String> wordsList1 = new ArrayList<>();        //  коллекция слов

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(file1)));
            String read;
            while ((read = br.readLine()) != null) {
                wordsList1.add(read);               // читаем все слова из файла и добавляем в коллекцию
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("I/O error.");
        }

        String file2 = "C://Users/y.prokopyeva/IdeaProjects/test/src/main/resources/PatronymicMale.txt";    // задаем имя файла
        List<String> wordsList2 = new ArrayList<>();        //  коллекция слов

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(file2)));
            String read;
            while ((read = br.readLine()) != null) {
                wordsList2.add(read);               // читаем все слова из файла и добавляем в коллекцию
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("I/O error.");
        }


        String file3 = "C://Users/y.prokopyeva/IdeaProjects/test/src/main/resources/NameFemale.txt";    // задаем имя файла
        List<String> wordsList3 = new ArrayList<>();        //  коллекция слов

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(file3)));
            String read;
            while ((read = br.readLine()) != null) {
                wordsList3.add(read);               // читаем все слова из файла и добавляем в коллекцию
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("I/O error.");
        }


        String file4 = "C://Users/y.prokopyeva/IdeaProjects/test/src/main/resources/SurnameFemale.txt";// задаем имя файла
        List<String> wordsList4 = new ArrayList<>();        //  коллекция слов

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(file4)));
            String read;
            while ((read = br.readLine()) != null) {
                wordsList4.add(read);               // читаем все слова из файла и добавляем в коллекцию
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("I/O error.");
        }

        String file5 = "C://Users/y.prokopyeva/IdeaProjects/test/src/main/resources/PatronymicFemale.txt";    // задаем имя файла
        List<String> wordsList5 = new ArrayList<>();        //  коллекция слов

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(file5)));
            String read;
            while ((read = br.readLine()) != null) {
                wordsList5.add(read);               // читаем все слова из файла и добавляем в коллекцию
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("I/O error.");
        }


              try {

            String filename = "C:/test/ExcelFile.xls";

            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("FirstSheet");

            HSSFRow rowhead = sheet.createRow((short) 0);
            rowhead.createCell(0).setCellValue("Фамилия");
            rowhead.createCell(1).setCellValue("Имя");
            rowhead.createCell(2).setCellValue("Отчество");
            rowhead.createCell(3).setCellValue("Пол");
            rowhead.createCell(4).setCellValue("Возраст");
            rowhead.createCell(5).setCellValue("Дата рождения");
            rowhead.createCell(6).setCellValue("ИНН");




        int i;
        for(i=1; i<randBetween(1, 5); i++) {
            HSSFRow row = sheet.createRow((short) i);

            GregorianCalendar gc = new GregorianCalendar();

            int year = randBetween(1980, 2010);

            gc.set(gc.YEAR, year);

            int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

            gc.set(gc.DAY_OF_YEAR, dayOfYear);

            String b =  gc.get(gc.DAY_OF_MONTH) + "-" + (gc.get(gc.MONTH) + 1) + "-" + (gc.get(gc.YEAR));

            int a;
            GregorianCalendar date = new GregorianCalendar();


            if ((date.get(date.DAY_OF_MONTH)<=(gc.get(gc.DAY_OF_MONTH))) && (date.get(date.MONTH)<=(gc.get(gc.MONTH)))) {
                a = (date.get(date.YEAR) - (gc.get(gc.YEAR))) - 1;
            } else {
                a = (date.get(date.YEAR) - (gc.get(gc.YEAR)));
            }



            long number = (long) Math.floor(Math.random() * 9000000000000L) + 1000000000000L;

            String str = Long.toString(number);


            if((str.charAt(0) == 7) && ((str.charAt(1) == 7))){
                row.createCell(6).setCellValue(number);
            } else {
                row.createCell(6).setCellValue("Инн не соответствет региону");
            }

            if (genderGenerator() == "Male") {

                row.createCell(0).setCellValue(wordsList1.get((int) (Math.random() * wordsList1.size())));
                row.createCell(1).setCellValue(wordsList.get((int) (Math.random() * wordsList1.size())));
                row.createCell(2).setCellValue(wordsList2.get((int) (Math.random() * wordsList2.size())));
                row.createCell(3).setCellValue("Male");
                row.createCell(4).setCellValue(a);
                row.createCell(5).setCellValue(b);
            } else {
                row.createCell(0).setCellValue(wordsList4.get((int) (Math.random() * wordsList1.size())));
                row.createCell(1).setCellValue(wordsList3.get((int) (Math.random() * wordsList1.size())));
                row.createCell(2).setCellValue(wordsList5.get((int) (Math.random() * wordsList2.size())));
                row.createCell(3).setCellValue("Female");
                row.createCell(4).setCellValue(a);
                row.createCell(5).setCellValue(b);
            }
        }
            FileOutputStream fileOut = new FileOutputStream(filename);

            workbook.write(fileOut);
            fileOut.close();
            System.out.println("Your excel file has been generated!");


        } catch (Exception ex) {
            System.out.println(ex);
        }


        // вывод абсолютного пути






    }


    static String genderGenerator() {

        double a = 0; // Начальное значение диапазона - "от"
        double b = 1; // Конечное значение диапазона - "до"
        String sexType = null;
        double random_number = a + (Math.random() * b);
        if (random_number > 0.5) {
            sexType = "Male";
        } else {
            sexType = "Female";
        }

        return sexType;

    }

    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }










}


















