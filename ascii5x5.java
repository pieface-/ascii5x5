public class ascii5X5
{
   private static String ascii[][] = 
      {
         // '-' is a space, 'x' is where the character goes
         
         //space
         {
            "-----",
            "-----",
            "-----",
            "-----",
            "-----"
         },
         //!
         {
            "-xxx-",
            "-xxx-",
            "-xxx-",
            "-----",
            "-xxx-"
            },
         //"
         {
            "-x-x-",
            "-x-x-",
            "-x-x-",
            "-----",
            "-----"
            },
         //#
         {
            "-x-x-",
            "xxxxx",
            "-x-x-",
            "xxxxx",
            "-x-x-"
         },
         //$
         {
            "-xxx-",
            "x-x--",
            "-xxx-",
            "--x-x",
            "-xxx-"
         },
         //%
         {
            "xx--x",
            "xx-x-",
            "--x--",
            "-x-xx",
            "x--xx"
         },
   		//&
   		{
            "--x--",
            "-x-x-",
            "--x--",
            "-x-x-",
            "--x-x"
         },
         //'
         {
            "--x--",
            "--x--",
            "--x--",
            "-----",
            "-----"
         },
         //(
         {
            "--x--",
            "-x---",
            "-x---",
            "-x---",
            "--x--"
         },
         //)
         {
            "--x--",
            "---x-",
            "---x-",
            "---x-",
            "--x--"
         },
         //*
         {
            "-x-x-",
            "--x--",
            "-x-x-",
            "-----",
            "-----"
         },
         //+
         {
            "-----",
            "--x--",
            "-xxx-",
            "--x--",
            "-----"
         },
         //,
         {
            "-----",
            "-----",
            "-----",
            "--x--",
            "-x---"
         },
         //-
         {
            "-----",
            "-----",
            "xxxxx",
            "-----",
            "-----"
         },
         //.
         {
            "-----",
            "-----",
            "-----",
            "-xxx-",
            "-xxx-"
         },
         ///
         {
            "----x",
            "---x-",
            "--x--",
            "-x---",
            "x----"
         },
         //0
         {
            "-xxx-",
            "-x-x-",
            "-x-x-",
            "-x-x-",
            "-xxx-"
         },
         //1
         {
            "--x--",
            "-xx--",
            "--x--",
            "--x--",
            "-xxx-"
         },
         //2
         {
            "-xxx-",
            "x---x",
            "---x-",
            "--x--",
            "xxxxx"
         },
         //3
         {
            "-xxx-",
            "x---x",
            "--xx-",
            "x---x",
            "-xxx-"
         },
         //4
         {
            "--xx-",
            "-x-x-",
            "xxxxx",
            "---x-",
            "---x-"
         },
         //5
         {
            "xxxxx",
            "x----",
            "xxxx-",
            "----x",
            "xxxx-"
         },
         //6
         {
            "-xxxx",
            "x----",
            "xxxx-",
            "x---x",
            "-xxx-"
         },
         //7
         {
            "xxxxx",
            "---x-",
            "--x--",
            "-x---",
            "x---"
         },
         //8
         {
            "-xxx-",
            "x---x",
            "-xxx-",
            "x---x",
            "-xxx-"
         },
         //9
         {
            "-xxx-",
            "x---x",
            "-xxxx",
            "----x",
            "-xxx-"
         },
         //:
         {
            "-xxx-",
            "-xxx-",
            "-----",
            "-xxx-",
            "-xxx-"
         },
         //;
         {
            "-xxx-",
            "-xxx-",
            "-----",
            "--x--",
            "-x---"
         },
         //<
         {
            "---xx",
            "-xx--",
            "x----",
            "-xx--",
            "---xx"
         },
         //=
         {
            "-----",
            "xxxxx",
            "-----",
            "xxxxx",
            "-----"
         },
         //>
         {
            "xx---",
            "--xx-",
            "----x",
            "--xx-",
            "xx---"
         },
         //?
         {
            "-xxx-",
            "x---x",
            "--xx-",
            "--x--",
            "--x--"
         },
         //@
         {
            "-xxx-",
            "x---x",
            "x-xxx",
            "x-xxx",
            "-xxx-"
         },
         //A
         {
            "-xxx-",
            "x---x",
            "xxxxx",
            "x---x",
            "x---x"
         },
         //B
         {
            "xxxx-",
            "x---x",
            "xxxx-",
            "x---x",
            "xxxx-"
         },
         //C
         {
            "-xxxx",
            "x----",
            "x----",
            "x----",
            "-xxxx"
         },
         //D
         {
            "xxxx-",
            "x---x",
            "x---x",
            "x---x",
            "xxxx-"
         },
         //E
         {
            "xxxxx",
            "x----",
            "xxx--",
            "x----",
            "xxxxx"
         },
         //F
         {
            "xxxxx",
            "x----",
            "xxx--",
            "x----",
            "x----"
         },
         //G
         {
            "-xxxx",
            "x----",
            "x--xx",
            "x---x",
            "-xxx-"
         },
         //H
         {
            "x---x",
            "x---x",
            "xxxxx",
            "x---x",
            "x---x"
         },
         //I
         {
            "xxxxx",
            "--x--",
            "--x--",
            "--x--",
            "xxxxx"
         },
         //J
         {
            "-xxxx",
            "---x-",
            "---x-",
            "x--x-",
            "-xx--"
         },
         //K
         {
            "x--xx",
            "x-xx-",
            "xx---",
            "x-xx-",
            "x--xx"
         },
         //L
         {
            "x----",
            "x----",
            "x----",
            "x----",
            "xxxxx"
         },
         //M
         {
            "x---x",
            "xx-xx",
            "x-x-x",
            "x---x",
            "x---x"
         },
         //N
         {
            "x---x",
            "xx--x",
            "x-x-x",
            "x--xx",
            "x---x"
         },
         //O
         {
            "-xxx-",
            "x---x",
            "x---x",
            "x---x",
            "-xxx-"
         },
         //P
         {
            "xxxx-",
            "x---x",
            "xxxx-",
            "x----",
            "x----"
         },
         //Q
         {
            "-xxx-",
            "x---x",
            "x---x",
            "-xxx-",
            "---xx"
         },
         //R
         {
            "xxxx-",
            "x---x",
            "xxxx-",
            "x-x--",
            "x--x-"
         },
         //S
         {
            "-xxx-",
            "x----",
            "-xxx-",
            "----x",
            "-xxx-"
         },
         //T
         {
            "xxxxx",
            "--x--",
            "--x--",
            "--x--",
            "--x--"
         },
         //U
         {
            "x---x",
            "x---x",
            "x---x",
            "x---x",
            "-xxx-"
         },
         //V
         {
            "x---x",
            "x---x",
            "-x-x-",
            "-x-x-",
            "--x--"
         },
         //W
         {
            "x---x",
            "x---x",
            "x-x-x",
            "x-x-x",
            "-x-x-"
         },
         //X
         {
            "x---x",
            "-x-x-",
            "--x--",
            "-x-x-",
            "x---x"
         },
         //Y
         {
            "x---x",
            "-x-x-",
            "--x--",
            "--x--",
            "--x--"
         },
         //Z
         {
            "xxxxx",
            "---x-",
            "--x--",
            "-x---",
            "xxxxx"
         },
         //[
         {
            "-xx--",
            "-x---",
            "-x---",
            "-x---",
            "-xx--"
         },
         //\
         {
            "x----",
            "-x---",
            "--x--",
            "---x-",
            "----x"
         },
         //]
         {
            "--xx-",
            "---x-",
            "---x-",
            "---x-",
            "--xx-"
         },
         //^
         {
            "--x--",
            "-x-x-",
            "-----",
            "-----",
            "-----"
         },
         //_
         {
            "-----",
            "-----",
            "-----",
            "-----",
            "xxxxx"
         },
         //`
         {
            "-x---",
            "--x--",
            "-----",
            "-----",
            "-----"
         },
         //a
         {
            "-xxx-",
            "----x",
            "--xxx",
            "-x--x",
            "-xxxx"
         },
         //b
         {
            "x----",
            "x----",
            "xxxx-",
            "x---x",
            "xxxx-"
         },
         //c
         {
            "-----",
            "-xxx-",
            "x----",
            "x----",
            "-xxx-"
         },
         //d
         {
            "----x",
            "----x",
            "-xxxx",
            "x---x",
            "-xxxx"
         },
         //e
         {
            "-xxx-",
            "x---x",
            "xxxx-",
            "x----",
            "-xxx-"
         },
         //f
         {
            "--xxx",
            "-x---",
            "xxxx-",
            "-x---",
            "-x---"
         },
         //g
         {
            "-xxx-",
            "x---x",
            "-xxxx",
            "----x",
            "-xxxx"
         },
         //h
         {
            "x----",
            "x----",
            "xxxx-",
            "x---x",
            "x---x"
         },
         //i
         {
            "--x--",
            "-----",
            "--x--",
            "--x--",
            "--x--"
         },
         //j
         {
            "---x-",
            "-----",
            "---x-",
            "x--x-",
            "-xx--"
         },
         //k
         {
            "x----",
            "x--x-",
            "x-x--",
            "xx---",
            "x-xx-"
         },
         //l
         {
            "--x--",
            "--x--",
            "--x--",
            "--x--",
            "--x--"
         },
         //m
         {
            "-----",
            "xx-x-",
            "x-x-x",
            "x---x",
            "x---x",
         },
         //n
         {
            "-----",
            "xxxx-",
            "x---x",
            "x---x",
            "x---x"
         },
         //o
         {
            "-----",
            "-xxx-",
            "x---x",
            "x---x",
            "-xxx-"
         },
         //p
         {
            "-----",
            "xxxx-",
            "x---x",
            "xxxx-",
            "x----"
         },
         //q
         {
            "-----",
            "-xxxx",
            "x---x",
            "-xxxx",
            "----x"
         },
         //r
         {
            "-----",
            "xxxx-",
            "x---x",
            "x----",
            "x----"
         },
         //s
         {
            "-----",
            "-xxxx",
            "xxxx-",
            "----x",
            "xxxx-"
         },
         //t
         {
            "--x--",
            "--x--",
            "-xxx-",
            "--x--",
            "--xx-"
         },
         //u
         {
            "-----",
            "x---x",
            "x---x",
            "x---x",
            "-xxxx"
         },
         //v
         {
            "-----",
            "x---x",
            "xx-xx",
            "-x-x-",
            "--x--"
         },
         //w
         {
            "-----",
            "x---x",
            "x---x",
            "x-x-x",
            "-x-x-"
         },
         //x
         {
            "-----",
            "x---x",
            "--x--",
            "-x-x-",
            "x---x"
         },
         //y
         {
            "-----",
            "x---x",
            "-x-x-",
            "--x--",
            "-x---"
         },
         //z
         {
            "-----",
            "xxxxx",
            "---x-",
            "-xx--",
            "xxxxx"
         },
         //{
         {
            "--xx-",
            "-x---",
            "x----",
            "-x---",
            "--xx-"
         },
         //|
         {
            "--x--",
            "--x--",
            "--x--",
            "--x--",
            "--x--"
         },
         //}
         {
            "-xx--",
            "---x-",
            "----x",
            "---x-",
            "-xx--"
         },
         //~
         {
            "-x--x",
            "x-xx-",
            "-----",
            "-----",
            "-----"
         }
         };
   
   public static void wewlad(String s)
   {
      println(s);
      for(int i = 1; i < s.length(); i++)
      {
         char c = s.charAt(i);
         println(c);
      }	   
   }
   
   public static void println(String s)
   {
      for(int i = 0; i < 5; i++)
      {
         
         for(int j = 0; j < s.length(); j++)
         {
            char c = s.charAt(j);
            System.out.print(parseLine(ascii[(int)c-32][i],c) + " ");
         }
         System.out.println();
      }
   }
   
   public static void println(char c)
   {
      for(int i = 0; i < 5; i++)
      {
         System.out.print(parseLine(ascii[(int)c-32][i],c) + " ");   
         System.out.println();
      }
   }
   
   public static void println(int i)
   {
      println(String.format("%d",i));
   }
   
   public static void println(double d)
   {
      println(String.format("%f",d));
   }
      	
   private static String parseLine(String s, char c)
   {
      String r = "";
      for(int i = 0; i < s.length(); i++)
         r += s.charAt(i) == 'x' ? c : ' ';
      return r;
   }
}
