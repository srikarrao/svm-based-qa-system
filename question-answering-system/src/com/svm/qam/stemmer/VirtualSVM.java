package com.svm.qam.stemmer;
import java.io.*;
import java.util.*;

public class VirtualSVM
{
	 public static void main(String[] args) throws IOException
	{
		for(int k=0;k<args.length;k++)
		{
		FileInputStream fis=new FileInputStream(args[k]);

		Scanner sc=new Scanner(fis);

		ArrayList<ArrayList<String>> al=new ArrayList<ArrayList<String>>();
		
		while(sc.hasNextLine())
		{
			String lyn=sc.nextLine();
			Scanner lynsc=new Scanner(lyn);
			ArrayList<String> a2=new ArrayList<String>();
			while(lynsc.hasNext())
			{
				a2.add(lynsc.next());
			}
			al.add(a2);		

		}
		

		ArrayList<String> lst=new ArrayList<String>();


		lst.add("list");
		lst.add("account");
		lst.add("database");
		lst.add("roll");
		lst.add("index");
		lst.add("schedule");
		

		ArrayList<String> opn=new ArrayList<String>();

		opn.add("opinion");
		opn.add("belief");
		opn.add("view");
		opn.add("thought");
		opn.add("inference");

		ArrayList<String> wh=new ArrayList<String>();
		wh.add("what");
		wh.add("where");
		wh.add("when");
		wh.add("who");
		wh.add("while");
		wh.add("why");
		wh.add("which");
		wh.add("whole");
		wh.add("how");
		wh.add("write");

		ArrayList<String> advant=new ArrayList<String>();
		advant.add("advantage");
		advant.add("asset");
		advant.add("assistance");
		advant.add("authority");
		advant.add("benefit");
		advant.add("control");
		advant.add("dominance");
		advant.add("good thing");
		advant.add("help");
		advant.add("lead");
		advant.add("plus");
		advant.add("positive aspect");
		advant.add("power");
		advant.add("pre-eminence");
		advant.add("profit");
		advant.add("supremacy");
		advant.add("vantage");
		advant.add("detriment");
		advant.add("disadvantage");
		advant.add("inferiority");

		ArrayList<String> caus=new ArrayList<String>();
		caus.add("cause");
		caus.add("basis");
		caus.add("bring");
		caus.add("create");
		caus.add("do");
		caus.add("effect");
		caus.add("end in");
		caus.add("exact");
		caus.add("explanation");
		caus.add("grounds");
		caus.add("impose");
		caus.add("incentive");
		caus.add("inception");
		caus.add("inflict");
		caus.add("lead to");
		caus.add("make happen");
		caus.add("mete out");
		caus.add("motivation");
		caus.add("motive");
		caus.add("origin");
		caus.add("origination");
		caus.add("produce");
		caus.add("rationale");
		caus.add("result");
		caus.add("wreak");


		ArrayList<String> comp=new ArrayList<String>();
		comp.add("comparison");
		comp.add("comparing");
		comp.add("examination");
		comp.add("scrutiny");

		
		ArrayList<String> def=new ArrayList<String>();
		def.add("definition");
		def.add("account");
		def.add("explanation");


		ArrayList<String> ex=new ArrayList<String>();
		ex.add("example");
		ex.add("archetype");
		ex.add("case");
		ex.add("case in point");
		ex.add("first of its kind");
		ex.add("guide");
		ex.add("illustration");
		ex.add("illustrate");
		ex.add("information");
		ex.add("instance");
		ex.add("mock-up");
		ex.add("model");
		ex.add("occasion");
		ex.add("occurence");
		ex.add("paradigm");
		ex.add("pattern");
		ex.add("prototype");
		ex.add("representative");
		ex.add("sample");
		ex.add("sampling");
		ex.add("section");
		ex.add("standard");
		ex.add("taster");
		ex.add("trial");
		ex.add("variety");


		ArrayList<String> expl=new ArrayList<String>();
		expl.add("account");
		expl.add("explain");
		expl.add("explanation");
		expl.add("amplification");
		expl.add("clarification");
		expl.add("clearing up");
		expl.add("defence");
		expl.add("description");
		expl.add("elucidation");
		expl.add("excuse");
		expl.add("explaining");
		expl.add("illumination");
		expl.add("reason");
		expl.add("relation");
		expl.add("report");
		expl.add("statement");
		expl.add("story");
		expl.add("version");


		ArrayList<String> ide=new ArrayList<String>();
		ide.add("authorization");
		ide.add("baptism");
		ide.add("christening");
		ide.add("credentials");
		ide.add("Identification");
		ide.add("designation");
		ide.add("determination");
		ide.add("determine");
		ide.add("find");
		ide.add("finding");
		ide.add("ID");
		ide.add("passport");
		ide.add("permit");


		ArrayList<String> rat=new ArrayList<String>();
		rat.add("rationale");
		rat.add("explanation");
		rat.add("principle");


		ArrayList<String> sig=new ArrayList<String>();
		sig.add("significance");
		sig.add("application");
		sig.add("prove");
		sig.add("apply");
		sig.add("bearing");
		sig.add("consequence");
		sig.add("gravity");
		sig.add("import");
		sig.add("importance");
		sig.add("magnitude");
		sig.add("meaning");
		sig.add("substance");
		sig.add("value");
		sig.add("weight");
		sig.add("weightiness");
		sig.add("worth");


		ArrayList f1=new ArrayList();
		ArrayList f2=new ArrayList();
		ArrayList f3=new ArrayList();
		ArrayList f4=new ArrayList();
		ArrayList f5=new ArrayList();
		ArrayList f6=new ArrayList();
		ArrayList f7=new ArrayList();
		ArrayList f8=new ArrayList();
		ArrayList f9=new ArrayList();
		ArrayList f10=new ArrayList();
		ArrayList f11=new ArrayList();
		ArrayList f12=new ArrayList();
		


		for(int i=0;i<al.size();i++){
		ArrayList<String> fw=new ArrayList(al.get(i));
		for(String st:fw)
		{
			if(lst.contains(st))
			{			
				f1.add(al.get(i));
			}
			else if(opn.contains(st))
			{
				f2.add(al.get(i));
			}
			else if(wh.contains(st))
			{
				f3.add(al.get(i));
			}
			else if(advant.contains(st))
			{
				f4.add(al.get(i));
			}
			else if(caus.contains(st))
			{
				f5.add(al.get(i));
			}
			else if(comp.contains(st))
			{
				f6.add(al.get(i));
			}
			else if(def.contains(st))
			{
				f7.add(al.get(i));
			}
			else if(ex.contains(st))
			{
				f8.add(al.get(i));
			}
			else if(expl.contains(st))
			{
				f9.add(al.get(i));
			}
			else if(ide.contains(st))
			{
				f10.add(al.get(i));
			}
			else if(rat.contains(st))
			{
				f11.add(al.get(i));
			}
			else if(sig.contains(st))
			{
				f12.add(al.get(i));
			}
		}}
		System.out.println("in class List:"+f1);
		System.out.println("in class Opinion:"+f2);
		System.out.println("in class Wh:"+f3);
		System.out.println("in class Advantage:"+f4);
		System.out.println("in class Cause:"+f5);
		System.out.println("in class Comparison:"+f6);
		System.out.println("in class Definition:"+f7);
		System.out.println("in class Example:"+f8);
		System.out.println("in class Explanation:"+f9);
		System.out.println("in class Identification:"+f10);
		System.out.println("in class Rationale:"+f11);
		System.out.println("in class Significance:"+f12);
		}
		
	}
}
								