import java.io.*;
import java.util.Random;
class kkbbcc
{
 static BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
 static Random r=new Random();
 static int stage,amt,life,aud=0,phone=0,expert=0,dd=0,dd1=0,correct,in,ffin,c;
 static String s1,opt;
 static int a[]={5000,10000,20000,40000,80000,160000,320000,640000,1250000,2500000,5000000,10000000,50000000};
 static String s[]={"1 : Audience poll","2 : Phone a friend","3 : Expert Advice","4 : Double dip"};
 
 public static void main(String args[])throws IOException
 {
     display();
    ddbs();
    }
    static void display()throws IOException
    {
        int j;
        System.out.print("Welcome to Kaun Banega Crorepati ");
        
        System.out.print("\nYou'll have to answer 13 questions to win 5 crore rupees\n");
        for(int i=1;i<=13;i++)
        {
            System.out.print("\n"+i+" <> Rs. "+a[i-1]);
                    }
        System.out.print("\n");
        stageset(); 
        System.out.print("\fIn addition to this, you'll have 4 lifelines to help you\n\n");
        System.out.print(s[0]+" : Will help you to take audience's opinion\n");
        System.out.print(s[1]+" : Will make you to call your friend for the answer\n");
        System.out.print(s[2]+" : Ask the experts for their advice\n");
        System.out.print(s[3]+" : Will allow you to give two answers for the same question\n");
        System.out.print("\nWarning : If you use double dip, you'll not be able to quit the game or use another lifeline");
        controls();
    }
    static void stageset()throws IOException
    {
        String c;
        System.out.print("\nPlease set a stage (Enter question number) : ");
        stage=Integer.parseInt(bfr.readLine());
        if(stage>=1 && stage<=13)
        {
            System.out.print("\nYou have selected : "+stage+" <> Rs. "+a[stage-1]);
            System.out.print("\n\nAre you sure (Y/N) : ");
            c=bfr.readLine();
            if(!(c.substring(0).equalsIgnoreCase("Y")))
            stageset();
        }
        else
        {
            System.out.print("\nInvalid input. Please enter again.\n");
            stageset();
        }
    }
    static void controls()throws IOException
    {
        System.out.print("\n\nEnter choices as A B C D");
        System.out.print("\nEnter 'L' to choose a life-line");
        System.out.print("\nEnter 'Q' to quit");
        System.out.print("\n\nEnter any key to clear screen and continue : ");
        s1=bfr.readLine();
        System.out.print("\f");
    }
    static void play()throws IOException
    {
        System.out.print("\n\nEnter your choice : ");
        opt=bfr.readLine();
        if(opt.substring(0).equalsIgnoreCase("A"))
        c=1;
        if(opt.substring(0).equalsIgnoreCase("B"))
        c=2;
        if(opt.substring(0).equalsIgnoreCase("C"))
        c=3;
        if(opt.substring(0).equalsIgnoreCase("D"))
        c=4;
        if(opt.substring(0).equalsIgnoreCase("L"))
        {
            lifeline();
            if(dd1==0)
            play();
            dd1=0;
        }
        if(opt.substring(0,1).equalsIgnoreCase("Q"))
        quit();
    }
    static void lifeline()throws IOException
    {
      
        System.out.print("\nYou have the following lifelines left : ");
        for(int i=0;i<=3;i++)
        System.out.print(s[i]+"  ");
        System.out.print("\n\nWhich one would you like to choose (Enter number) : ");
        life=Integer.parseInt(bfr.readLine());
        switch(life)
        {
            case 1:
            audience();
            break;
            case 2:
            phone();
            break;
            case 3:
            expert();
            break;
            case 4:
            dip();
            break;
            default:
            System.out.print("\nThis life line is not available");
        }
    }
    static void ddbs()throws IOException
    {
        int count=1;
        System.out.print("Stage : "+count+" <> "+a[0]+"\n\n");
        System.out.print("Which state of India reported its first Covid-19 patient ");
        System.out.print("\n\nA: Tamil Nadu\t\tB: Kerela\nC: Rajasthan\t\tD: Maharashtra ");
        correct=2;
        play();
        if(correct==c)
        {
            in=a[0];
            System.out.print("\nWell done. Correct answer.");
            if(stage==1)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is B: Kerela");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        
        count++;
        System.out.print("\fStage : "+count+" <> "+a[1]+"\n\n");
        System.out.print("On which date The Prime Minister , Mr. Narendra Modi joined NAM (Non-Alligned-Movement)Summit virtually in 2020? : ");
        System.out.print("\n\nA: 18 January 2020\t\tB: 12 March 2020\nC: 4 May 2020\t\tD: 5 April 2020");
        correct=3;
        play();
        if(correct==c)
        {
            in=a[1];
            System.out.print("\nWell done. Correct answer.");
            if(stage==2)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is C: 4 May 2020");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=bfr.readLine();
        count++;
        System.out.print("\fStage : "+count+" <> "+a[2]+"\n\n");
        System.out.print("Which movie wins the Best Motion Picture ., Drama in the 2019 Golden Globes ? : ");
        System.out.print("\n\nA:  Roma\t\tB: The Wife\nC:  Green Book\t\tD: Bohemian Rhapsody");
        correct=4;
        play();
        if(correct==c)
        {
            in=a[2];
            System.out.print("\nWell done. Correct answer.");
            if(stage==3)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is D: Bohemian Rhapsody");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=bfr.readLine();
        count++;
        System.out.print("\fStage : "+count+" <> "+a[3]+"\n\n");
        System.out.print("What is the full form of the 'APJ' in Dr. Kalam's name? : ");
        System.out.print("\n\nA: Ahmed Panthwawala Jain\t\tB: Avul Pakir Jainulabdeen\nC: Ali Ponnuswamy Jampiru\t\tD: Akbar Panneer Jalant");
        correct=2;
        play();
        if(correct==c)
        {
            in=a[3];
            System.out.print("\nWell done. Correct answer.");
            if(stage==4)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is B: Avul Pakir Jainulabdeen");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=bfr.readLine();
        count++;
        System.out.print("\fStage : "+count+" <> "+a[4]+"\n\n");
        System.out.print("Who is the first woman head of state to fly in a fighter jet : ");
        System.out.print("\n\nA: Smt. Pratibha Devisingh Patil\t\tB: Isabel Martínez de Perón\nC: Mary McAleese\t\tD: Valeria Ciavatta");
        correct=1;
        play();
        if(correct==c)
        {
            in=a[4];
            System.out.print("\nWell done. Correct answer.");
            if(stage==5)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is A: Smt. Pratibha Devisingh Patil");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=bfr.readLine();
        count++;
        System.out.print("\fStage : "+count+" <> "+a[5]+"\n\n");
        System.out.print("Who is the CEO of Tesla ? : ");
        System.out.print("\n\nA: Warren Buffett\t\tB: Elon Musk\nC: Nikola Tesla\t\tD: Amber Heard");
        correct=2;
        play();
        if(correct==c)
        {
            in=a[5];
            System.out.print("\nWell done. Correct answer.");
            if(stage==6)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is B: Yum! Restaurants");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=bfr.readLine();
        count++;
        System.out.print("\fStage : "+count+" <> "+a[6]+"\n\n");
        System.out.print("Where was the first oil well struck in the world? : ");
        System.out.print("\n\nA: Kuwait\t\tB: USA\nC: Saudi Arabia\t\tD: Australia");
        correct=2;
        play();
        if(correct==c)
        {
            in=a[6];
            System.out.print("\nWell done. Correct answer.");
            if(stage==7)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is B: USA");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=bfr.readLine();
        count++;
        System.out.print("\fStage : "+count+" <> "+a[7]+"\n\n");
        System.out.print("Located in India it is Asia's largest residential university. Name it...? : ");
        System.out.print("\n\nA: Banaras Hindu University\t\tB: The Utkal University\nC: Jawaharlal Nehru University\t\tD: Anna University");
        correct=1;
        play();
        if(correct==c)
        {
            in=a[7];
            System.out.print("\nWell done. Correct answer.");
            if(stage==8)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is A: Banaras Hindu University");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=bfr.readLine();
        count++;
        System.out.print("\fStage : "+count+" <> "+a[8]+"\n\n");
        System.out.print("Who among the following is NOT associated with billiards in India? : ");
        System.out.print("\n\nA: Subash Agrawal\t\tB: Ashok Shandilya\nC: Manoj Kothari\t\tD: Mihir Sen");
        correct=4;
        play();
        if(correct==c)
        {
            in=a[8];
            System.out.print("\nWell done. Correct answer.");
            if(stage==9)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is D: Mihir Sen");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=bfr.readLine();
        count++;
        System.out.print("\fStage : "+count+" <> "+a[9]+"\n\n");
        System.out.print("Who among the following was NOT the Chief Minister of Madras state or the Tamil Nadu? : ");
        System.out.print("\n\nA: C.Rajagopalachari\t\tB: C.Annadurai\nC: M.G.Ramachandran\t\tD: Poti Sriramulu");
        correct=4;
        play();
        if(correct==c)
        {
            in=a[9];
            System.out.print("\nWell done. Correct answer.");
            if(stage==10)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is D: Poti Sriramulu");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=bfr.readLine();
        count++;
        System.out.print("\fStage : "+count+" <> "+a[10]+"\n\n");
        System.out.print("Who wrote the Novel 'Pather Dabi' in Bengali? : ");
        System.out.print("\n\nA: Kazi Nazrul Islam\t\tB: Bankim Chandra\nC: Saratchandra Chattopadhay\t\tD: Rabindranath Tagore");
        correct=3;
        play();
        if(correct==c)
        {
            in=a[10];
            System.out.print("\nWell done. Correct answer.");
            if(stage==11)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is C: Saratchandra Chattopadhay");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=bfr.readLine();
        count++;
        System.out.print("\fStage : "+count+" <> "+a[11]+"\n\n");
        System.out.print("Which of the following is a popular form of Buddhism in Japan? : ");
        System.out.print("\n\nA: Zen\t\tB: Pikachu\nC: Totoro\t\tD: Matsushita");
        correct=1;
        play();
        if(correct==c)
        {
            in=a[11];
            System.out.print("\nWell done. Correct answer.");
            if(stage==12)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is A: Zen");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=bfr.readLine();
        count++;
        System.out.print("\fStage : "+count+" <> "+a[12]+"\n\n");
        System.out.print("What was the capital of Panchala? : ");
        System.out.print("\n\nA: Dwaraka\t\tB: Matsya\nC: Kamapilya\t\tD: Magadha");
        correct=3;
        play();
        if(correct==c)
        {
            in=a[12];
            System.out.print("\nWell done. Correct answer.");
            if(stage==13)
            {
                ffin=in;
                System.out.print("\n\nCongratulations!!, you have completed your choosed stage succesfully");
            }
        }
        else
        {
            System.out.print("\nSorry!, but this is the wrong answer");
            System.out.print("\n\nCorrect answer is C: Kamapilya");
            end();
        }
        System.out.print("\n\nEnter any key to continue : ");
        s1=bfr.readLine();
        count++;
        System.out.print("\f");
        for(int i=1;i<=3;i++)
        {
            System.out.print("Many ");
        }
        System.out.print("Congratulations to you.\n\nYou have done this challenge");
        quit();
    }
    static void audience()throws IOException
    {
        aud++;
        int a[]=new int[3];
        int s1=0,i,j,c;
        s[0]="";
        for(i=0;i<=2;i++)
        {
            c=r.nextInt(15);
            a[i]=c;
        }
        s1=100-(a[0]+a[1]+a[2]);
        System.out.print("\nAwaiting reply ");
        for(i=1;i<=3;i++)
        {
            System.out.print(".");
                   }
        System.out.print("\n\n");
        if(correct==1)
        {
            System.out.print("\nA : "+s1+" %");
            System.out.print("\nB : "+a[0]+" %");
            System.out.print("\nC : "+a[1]+" %");
            System.out.print("\nD : "+a[2]+" %");
        }
        if(correct==2)
        {
            System.out.print("\nA : "+a[0]+" %");
            System.out.print("\nB : "+s1+" %");
            System.out.print("\nC : "+a[1]+" %");
            System.out.print("\nD : "+a[2]+" %");
        }
        if(correct==3)
        {
            System.out.print("\nA : "+a[1]+" %");
            System.out.print("\nB : "+a[0]+" %");
            System.out.print("\nC : "+s1+" %");
            System.out.print("\nD : "+a[2]+" %");
        }
        if(correct==4)
        {
            System.out.print("\nA : "+a[2]+" %");
            System.out.print("\nB : "+a[0]+" %");
            System.out.print("\nC : "+a[1]+" %");
            System.out.print("\nD : "+s1+" %");
        }
    }
    static void phone()
    {
        phone++;
        int c=r.nextInt(5);
        System.out.print("\n");
        s[1]="";
        if(c==1 || c==3 || c==5 || c==4)
        {
            if(correct==1)
            System.out.print("Friend says its 'A'");
            if(correct==2)
            System.out.print("Friend says its 'B'");     
            if(correct==3)
            System.out.print("Friend says its 'C'");
            if(correct==4)
            System.out.print("Friend says its 'D'");
        }
        else
        System.out.print("Friend has no idea");
    }
    static void expert()
    {
        expert++;
        int c=r.nextInt(5);
        System.out.print("\n");
        s[2]="";
        if(c==1 || c==3 || c==5 || c==4)
        {
            if(correct==1)
            System.out.print("Expert thinks it to be 'A'");
            if(correct==2)
            System.out.print("Expert thinks it to be 'B'");     
            if(correct==3)
            System.out.print("Expert thinks it to be 'C'");
            if(correct==4)
            System.out.print("Expert thinks it to be 'D'");
        }
        else
        System.out.print("Expert has no idea");
    }
    static void dip()throws IOException
    {
        s[3]="";
        dd1=1;
        dd++;
        System.out.print("\nFirst choice : ");
        play();
        if(correct==c)
        {
           System.out.print("\nCorrect answer");
        }
        else
        {
            System.out.print("\nWrong answer\n\nSecond choice : ");
            play();
        }
    }
    static void quit()
    {
        ffin=in;
        end();
    }
    static void end()
    {
        System.out.print("\n\nYou have won Rs. "+ffin);
        System.out.print("\n\nThank you for participating in Kaun Banega Crorepati");
        System.out.print("\n\nWish you all the best\nSee you again.");
        System.exit(0);
    }
}
           
