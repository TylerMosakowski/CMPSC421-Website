package org.apache.jsp;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BXB5236
 */
public class Roster implements Serializable {
    public Student [] students;
    
    public Roster()
    {
       students[0].setLName("Baker");
        students[0].setFName("Austin");
        students[0].setID("ARB5671");
        students[0].setTeam(3);
        
        students[1].setLName("Balos");
        students[1].setFName("Amanda");
        students[1].setID("AZB199");
        students[1].setTeam(1);
        
        students[2].setLName("Balta");
        students[2].setFName("Trent");
        students[2].setID("TMB5577");
        students[2].setTeam(12);
        
        students[4].setLName("Cambell");
        students[4].setFName("Matthew");
        students[4].setID("MRC5372");
        students[4].setTeam(10);
        
        students[5].setLName("Duong");
        students[5].setFName("Charlie");
        students[5].setID("CTD5100");
        students[5].setTeam(9);
        
        students[6].setLName("Goga");
        students[6].setFName("Daniel");
        students[6].setID("DRG5190");
        students[6].setTeam(11);
        
        students[7].setLName("Hankewycz");
        students[7].setFName("Andrew");
        students[7].setID("AZH5442");
        students[7].setTeam(7);
        
        students[8].setLName("Hansen");
        students[8].setFName("Robert");
        students[8].setID("RAH5360");
        students[8].setTeam(8);
        
        students[9].setLName("Ivanco");
        students[9].setFName("Justin");
        students[9].setID("JJI5019");
        students[9].setTeam(10);
        
        students[10].setLName("Jacobs");
        students[10].setFName("Tyler");
        students[10].setID("TAJ5130");
        students[10].setTeam(7);
        
        students[11].setLName("Jones");
        students[11].setFName("Edward");
        students[11].setID("EAJ5073");
        students[11].setTeam(6);
        
        students[12].setLName("Kalmar");
        students[12].setFName("Peter");
        students[12].setID("PJK5220");
        students[12].setTeam(3);
        
        students[13].setLName("Karsh");
        students[13].setFName("James");
        students[13].setID("JRK5377");
        students[13].setTeam(12);
        
        students[14].setLName("Kelleher");
        students[14].setFName("Austin");
        students[14].setID("ALK5492");
        students[14].setTeam(7);
        
        students[15].setLName("Kruzan");
        students[15].setFName("Andrew");
        students[15].setID("ASK5264");
        students[15].setTeam(4);
        
        students[16].setLName("Kubacki");
        students[16].setFName("David");
        students[16].setID("DMK5048");
        students[16].setTeam(5);
        
        students[17].setLName("Lin");
        students[17].setFName("Gary");
        students[17].setID("GDL5051");
        students[17].setTeam(6);
        
        students[18].setLName("Louchart");
        students[18].setFName("Gregory");
        students[18].setID("GDL5051");
        students[18].setTeam(2);
        
        students[19].setLName("Orosz");
        students[19].setFName("Zachary");
        students[19].setID("ZJO5002");
        students[19].setTeam(6);
        
        students[20].setLName("Panetta");
        students[20].setFName("Matthew");
        students[20].setID("MDP5280");
        students[20].setTeam(9);
        
        students[21].setLName("Poljak");
        students[21].setFName("Dylan");
        students[21].setID("DJP5319");
        students[21].setTeam(4);
        
        students[22].setLName("Rausch");
        students[22].setFName("Austin");
        students[22].setID("AHR5067");
        students[22].setTeam(12);
        
        students[23].setLName("Reese");
        students[23].setFName("Arin");
        students[23].setID("AWR5319");
        students[23].setTeam(11);
        
        students[24].setLName("Reott");
        students[24].setFName("Zachary");
        students[24].setID("ZDR5023");
        students[24].setTeam(6);
        
        students[25].setLName("Ristau");
        students[25].setFName("Brian");
        students[25].setID("BJR5336");
        students[25].setTeam(2);
        
        students[26].setLName("Ristau");
        students[26].setFName("Steven");
        students[26].setID("SPR5122");
        students[26].setTeam(2);
        
        students[27].setLName("Rosswog");
        students[27].setFName("Chistopher");
        students[27].setID("CMR5556");
        students[27].setTeam(10);
        
        students[28].setLName("Shultz");
        students[28].setFName("James");
        students[28].setID("JTS5507");
        students[28].setTeam(8);
        
        students[29].setLName("Sitterley");
        students[29].setFName("Shaun");
        students[29].setID("SMS6179");
        students[29].setTeam(4);
        
        students[30].setLName("Stankiewicz");
        students[30].setFName("Mark");
        students[30].setID("MIS5708");
        students[30].setTeam(9);
        
        students[31].setLName("Steen");
        students[31].setFName("Joshua");
        students[31].setID("JDS5782");
        students[31].setTeam(9);
        
        students[32].setLName("Tarosky");
        students[32].setFName("Kimberly");
        students[32].setID("KRT5110");
        students[32].setTeam(1);
        
        students[33].setLName("Taylor");
        students[33].setFName("Dylan");
        students[33].setID("DMT5235");
        students[33].setTeam(3);
        
        students[34].setLName("Vallo");
        students[34].setFName("Alexander");
        students[34].setID("ANV5067");
        students[34].setTeam(2);
        
        students[35].setLName("Wilczek");
        students[35].setFName("Connor");
        students[35].setID("CVW5203");
        students[35].setTeam(5);
    }       
        public Student[] getStudents()
        {
        return students;
    }
    
}
