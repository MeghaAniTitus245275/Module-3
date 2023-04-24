package com.ust.ioc2;

public class Line {

		point p1 ;
		point p2;
	
		
		public point getP1() {
			return p1;
		}


		public void setP1(point p1) {
			this.p1 = p1;
		}


		public point getP2() {
			return p2;
		}


		public void setP2(point p2) {
			this.p2 = p2;
		}

		

		public Line(point p1, point p2) {
			
			System.out.println("from Line (p1,p2)....");
			this.p1 = p1;
			this.p2 = p2;
		}


		public void drawLine() {
			 System.out.println("from "+p1.getX()+","+p1.getY()+".....to....."+p2.getX()+","+p2.getY());
			 
			 
		}
		
		public void init()
		{
			System.out.println("from init()...");
		}
		
		public void destroy()
		{
			System.out.println("from destroy()...");
		}
		
			}


