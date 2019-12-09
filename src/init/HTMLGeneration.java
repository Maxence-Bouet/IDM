package init;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import eMProject.Animal;
import eMProject.Enclos;
import eMProject.Soigneur;
import eMProject.Zoo;

public class HTMLGeneration {
	
	public void generateHTMLFromZoo(Zoo zoo){
		
		try {
		File f = new File("output/zoo"+zoo.getId()+".html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("<html>");
        bw.write("<body>");
        bw.write("<h1>Zoo n° "+zoo.getId()+"</h1>");
        
        
        for(int i=0;i<zoo.getEnclos().size();i++) {
        	Enclos enclos = zoo.getEnclos().get(i);
            bw.write("<h2><a href='enclos"+enclos.getId()+".html'>"+"Enclos n° "+enclos.getId()+"</a>"+"</h2>");
            bw.newLine();
            for(int j=0;j<enclos.getSoigneur().size();j++) {
            	Soigneur soigneur = enclos.getSoigneur().get(j);
            	bw.write("<a href='soigneur"+soigneur.getId()+".html'>Soigneur n° "+soigneur.getId()+" "+soigneur.getName()+"</a>");
            	bw.write("<br>");
                bw.newLine();
                generateSoigneur(soigneur);
            }
            for(int k=0;k<enclos.getAnimal().size();k++) {
            	Animal animal =enclos.getAnimal().get(k);
            	bw.write("<a href='"+animal.getClass().getSimpleName().split("Impl")[0]+animal.getId()+".html'>"+animal.getClass().getSimpleName().split("Impl")[0]+" n° "+animal.getId()+" "+animal.getName()+"</a>");
            	bw.write("<br>");
                bw.newLine();
                generateAnimal(animal);
            }
            generateEnclos(enclos);
            
        }

        bw.write("</body>");
        bw.write("</html>");

        bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void generateAnimal(Animal animal) {
		try {
			System.out.println(animal.getClass().getSimpleName().split("Impl")[0]);
		File f = new File("output/"+animal.getClass().getSimpleName().split("Impl")[0]+animal.getId()+".html");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("<html>");
        bw.write("<body>");
        bw.write("<h1>"+animal.getClass().getSimpleName().split("Impl")[0]+" n° "+animal.getId()+"</h1>");
        bw.write("<h2>Nom : "+animal.getName()+"</h2>");
        bw.write("<a href='enclos"+animal.getEnclos().getId()+".html'>Enclos n° "+animal.getEnclos().getId()+"</a>");
        bw.write("</body>");
        bw.write("</html>");

        bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void generateEnclos(Enclos enclos) {
		try {
		File f = new File("output/enclos"+enclos.getId()+".html");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("<html>");
        bw.write("<body>");
        bw.write("<h1>Enclos n° "+enclos.getId()+"</h1>");
        bw.write("<h2>Soigneurs</h2>");
        for(int i=0;i<enclos.getSoigneur().size();i++) {
        	Soigneur soigneur = enclos.getSoigneur().get(i);
        	bw.write("<a href='soigneur"+soigneur.getId()+".html'>Soigneur n° "+soigneur.getId()+"</a>");
        	bw.write("<br>");
            bw.newLine();
        }
        bw.write("<h2>Animaux</h2>");
        for(int j=0;j<enclos.getAnimal().size();j++) {
        	Animal animal = enclos.getAnimal().get(j);
        	bw.write("<a href='"+animal.getClass().getSimpleName().split("Impl")[0]+animal.getId()+".html'>"+animal.getClass().getSimpleName().split("Impl")[0]+" n° "+animal.getId()+" "+animal.getName()+"</a>");
        	bw.write("<br>");
            bw.newLine();
        }
        bw.write("<br>");
        bw.write("<br>");
        bw.write("<br>");
        bw.write("<br>");
        bw.write("<a href='zoo"+enclos.getZoo().getId()+".html'>Zoo n° "+enclos.getZoo().getId()+"</a>");
        bw.write("<br>");
        bw.write("</body>");
        bw.write("</html>");

        bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void generateSoigneur(Soigneur soigneur) {
		try {
		File f = new File("output/soigneur"+soigneur.getId()+".html");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write("<html>");
        bw.write("<body>");
        bw.write("<h1>Soigneur n° "+soigneur.getId()+"</h1>");
        bw.write("<h2>Nom : "+soigneur.getName()+"</h2>");
        bw.write("<h2>Enclos</h2>");
        for(int i=0;i<soigneur.getEnclos().size();i++) {
        	Enclos enclos = soigneur.getEnclos().get(i);
        	bw.write("<a href='enclos"+enclos.getId()+".html'>Enclos n° "+enclos.getId()+"</a>");
        	bw.write("<br>");
            bw.newLine();
        }
        bw.write("<br>");
        bw.write("<br>");
        bw.write("<br>");
        bw.write("<br>");
        bw.write("<a href='zoo"+soigneur.getZoo().getId()+".html'>Zoo n° "+soigneur.getZoo().getId()+"</a>");
        bw.write("<br>");
        bw.write("</body>");
        bw.write("</html>");

        bw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
