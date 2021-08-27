//Miniproject for dsa 
//Designing a quiz portal by using binary tree and tree data structure

import java.util.Scanner;  //import Scanner class
class Node
{
	Node left,right,middle1,middle2;
	String data;
	public Node (String d)//parameterized constructor
	{
		left=null;
		middle1 = null;
		middle2 = null;
		right=null;
		data=d;
	}
}
class binarytree  //class binary tree is declared
{            

	Node root;
	int lcount,rcount;
	public binarytree()       //Default constructor
	{
		root=null;
		lcount=0;
		rcount=0;
	}

	public void create_leftRight(binarytree tree) //creating left right brain tree
	{
		System.out.println("=========================================================================================");  
		System.out.println("\n\t\t\t\t *** Left-Right Brain Quiz *** ");
		tree.root = new Node("\nDo you seek logic in everything ?");
		tree.root.left = new Node("Are you good at critical thinking?");
		tree.root.right = new Node("Have you got a wild imagination?");
		tree.root.left.left = new Node("Do you enjoy doing maths?");
		tree.root.left.right = new Node("Do you more inclined towards artistic side than technical side?");
		tree.root.left.left.left = new Node("Can you predict the approximate time without using a watch?");
		tree.root.left.left.right = new Node("When you meet a new person do you recognize their faces rather than their names?");
		tree.root.left.right.left = new Node("Can you predict the approximate time without using a watch?");
		tree.root.left.right.right = new Node("Do you like exploring or learning new languages?"); //end of left 4 level subtree
		tree.root.right.left = new Node("Do science experiments excite you?");
		tree.root.right.right = new Node("Are you good at reading emotions?");
		tree.root.right.left.left = new Node("Do you find riddles interesting?");
		tree.root.right.left.right = new Node("Are you a Thrill-seeker?");
		tree.root.right.right.left = new Node("Are you rational when you take decisions?");
		tree.root.right.right.right = new Node("Do you often find yourself daydream?");

		tree.root.left.left.left.left = new Node("Do you think you can speak to any person fluently?");
		tree.root.left.left.left.right = new Node("Do you often find yourself lost in thoughts?");
		tree.root.left.left.right.left = new Node("Do you consider yourself fact-oriented person?");
		tree.root.left.left.right.right = new Node("During school days, did you enjoy doing craft?");
		tree.root.left.right.left.left = new Node("Do you usually write with right hand?");
		tree.root.left.right.left.right = new Node("Do you usually write with left hand?");
		tree.root.left.right.right.left = new Node("If you are stuck in some situation, do you try to solve the problem by gathering detailed information?");
		tree.root.left.right.right.right = new Node("Is emotional intelligence one of your strong pursuits?");

		tree.root.right.left.left.left = new Node("Do you believe in living in present moment? ");
		tree.root.right.left.left.right = new Node("Are you very spontenous ?");
		tree.root.right.left.right.left = new Node("Do you consider yourself factual?");
		tree.root.right.left.right.right = new Node("Are you usually write with left hand?");
		tree.root.right.right.left.left = new Node("Do you like to make daily list of tasks and organized things?");
		tree.root.right.right.left.right = new Node("Are you usually write with left hand?");
		tree.root.right.right.right.left = new Node("Are you more of introvert person?");
		tree.root.right.right.right.right = new Node("Are you more of extrovert person?");
		System.out.println("=========================================================================================");  

	}

	public void display_leftRight()//displaying result of quiz
	{

		Node ptr = root;
		while (ptr!=null)
		{

			System.out.println(ptr.data);
			System.out.println("1.Yes  2.No");//option for user
			Scanner input = new Scanner(System.in);
			int element = input.nextInt();//accepting option from user
			if(element == 1) //it will traverse left subtree
			{
				ptr = ptr.left;
				lcount++;
			}
			else if(element == 2)//it will traverse right subtree
			{
				ptr = ptr.right;
				rcount++;
			}
			else if(element!=1&&element!=2)//checking validation
			{
				System.out.println("You entered invalid option");
			}

		}  
	}

	void count() //calculating result of left brain right brain result
	{
		System.out.println("=========================================================================================");  
		if(lcount > rcount) //result is you are left brained
		{
			System.out.println("\n\nHere we go! \nThis is your result!! \n\nBased on your answers,it seems you are Left-brained.\nYou insist on looking at straight-up facts when making decisions.\nYou don't tend to let your emotions get the best of you.\nYour friends and family members would describe you as a 'analytical' and 'orderly' person.\n");
		}
		else//result is you are right brained
		{
			System.out.println("\n\nHere we go! \nThis is your result!! \n\nBased on your answers,it seems you are Right-brained.\nYou are good at projecting your emotions and are rather focused on art and creativity.\nImagination predominates your brain but you tend to get occasionally absent-minded.\n");
		}
		System.out.println("=========================================================================================");    
	}

}
class Zodiac
{             //class Zodiac is declared

	Node root;
	public Zodiac()       //Default constructor
	{
		root=null;
	}

	public void create_zodiac(Zodiac tree) //creating zodiac tree
	{
		System.out.println("=========================================================================================");  
		System.out.println("\n\t\t\t **Let's guess your Zodiac sign!** ");
		System.out.println("=========================================================================================");    

		tree.root = new Node("\nChoose your element \n1.Fire 2.Water 3.Air 4.Earth");

		tree.root.left = new Node("I am a bold person \n1.Strongly agree 2. Agree 3.Strongly disagree ");
		tree.root.left.left = new Node("I choose to do things on my own terms \n1.Strongly agree 2. Agree 3.Strongly disagree ");
		tree.root.left.middle1 = new Node("I exhibit leadership quality \n1.Strongly agree 2. Agree 3.Strongly disagree ");
		tree.root.left.middle2 = new Node("I get along with people easily \n1.Strongly agree 2. Agree 3.Strongly disagree ");

		tree.root.left.left.left = new Node("\nYour sign seems to be Aries\nElement: Fire\nStrengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\nWeaknesses: Impatient, moody, short-tempered, impulsive, aggressive");
		tree.root.left.left.middle1 = new Node("\nYour sign seems to be Aries\nElement: Fire\nStrengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\nWeaknesses: Impatient, moody, short-tempered, impulsive, aggressive");
		tree.root.left.left.middle2 = new Node("\nYour sign seems to be Aries\nElement: Fire\nStrengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate\nWeaknesses: Impatient, moody, short-tempered, impulsive, aggressive");

		tree.root.left.middle1.left = new Node("\nYour sign seems to be Leo\nElement: Fire\nStrengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\nWeaknesses: Arrogant, stubborn, self-centered, lazy, inflexible");
		tree.root.left.middle1.middle1 = new Node("\nYour sign seems to be Leo\nElement: Fire\nStrengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\nWeaknesses: Arrogant, stubborn, self-centered, lazy, inflexible");
		tree.root.left.middle1.middle2 = new Node("\nYour sign seems to be Leo\nElement: Fire\nStrengths: Creative, passionate, generous, warm-hearted, cheerful, humorous\nWeaknesses: Arrogant, stubborn, self-centered, lazy, inflexible");

		tree.root.left.middle2.left = new Node("\nYour sign seems to be Sagittarius\nElement: Fire\nStrengths: Generous, idealistic, great sense of humor\nWeaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic");
		tree.root.left.middle2.middle1 = new Node("\nYour sign seems to be Sagittarius\nElement: Fire\nStrengths: Generous, idealistic, great sense of humor\nWeaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic");
		tree.root.left.middle2.middle2 = new Node("\nYour sign seems to be Sagittarius\nElement: Fire\nStrengths: Generous, idealistic, great sense of humor\nWeaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic");

		// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		tree.root.middle1 = new Node("I am moved to tears by sad movies or stories. \n1.Strongly agree 2. Agree 3.Kinda disagree");
		tree.root.middle1.left = new Node("I never betray my loved ones.\n1.Strongly agree 2. Agree 3.Kinda disagree");
		tree.root.middle1.middle1 = new Node("I am an intuitive person.\n1.Strongly agree 2. Agree 3.Kinda disagree");
		tree.root.middle1.middle2 = new Node("I am a adventurous person. \n1.Strongly agree 2. Agree 3.Kinda disagree ");

		tree.root.middle1.left.left = new Node("\nYour sign seems to be Cancer\nElement: Water \nStrengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\nWeaknesses: Moody, pessimistic, suspicious, manipulative, insecure");
		tree.root.middle1.left.middle1 = new Node("\nYour sign seems to be Cancer\nElement: WaterStrengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\nWeaknesses: Moody, pessimistic, suspicious, manipulative, insecure");
		tree.root.middle1.left.middle2 = new Node("\nYour sign seems to be Cancer\nElement: WaterStrengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive\nWeaknesses: Moody, pessimistic, suspicious, manipulative, insecure");

		tree.root.middle1.middle1.left = new Node("\nYour sign seems to be Pieces\nElement: Water Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\nWeaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr");
		tree.root.middle1.middle1.middle1 = new Node("\nYour sign seems to be Pieces\nElement: Water Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\nWeaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr");
		tree.root.middle1.middle1.middle2 = new Node("\nYour sign seems to be Pieces\nElement: Water Strengths: Compassionate, artistic, intuitive, gentle, wise, musical\nWeaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr");

		tree.root.middle1.middle2.left = new Node("\nYour sign seems to be Scorpion\nStrengths: Resourceful, brave, passionate, stubborn, a true friend \nWeaknesses: Distrusting, jealous, secretive, violent");
		tree.root.middle1.middle2.middle1 = new Node("\nYour sign seems to be Scorpion\nStrengths: Resourceful, brave, passionate, stubborn, a true friend \nWeaknesses: Distrusting, jealous, secretive, violent");
		tree.root.middle1.middle2.middle2 = new Node("\nYour sign seems to be Scorpion\nStrengths: Resourceful, brave, passionate, stubborn, a true friend \nWeaknesses: Distrusting, jealous, secretive, violent");


		// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		tree.root.middle2 = new Node("I look at the world as a place full of possibilities.\n1.Strongly agree 2. Agree 3.Kinda disagree");
		tree.root.middle2.left = new Node("When I listen to someone talk about a problem, I can identify with the way he or she is feeling.\n1.Strongly agree 2. Agree 3.Kinda disagree");
		tree.root.middle2.middle1 = new Node("I never hesitate to learn new things.\n1.Strongly agree 2. Agree 3.Kinda disagree");
		tree.root.middle2.middle2 = new Node("I love socializing. I love hearing other people's ideas, but I can also be pretty talkative yourself.\n1.Strongly agree 2. Agree 3.Kinda disagree ");

		tree.root.middle2.left.left = new Node("\nYour sign seems to be Aquarius\nElement: Air \nStrengths: Progressive, original, independent, humanitarian\nWeaknesses: Runs from emotional expression, temperamental, uncompromising, aloof");
		tree.root.middle2.left.middle1 = new Node("\nYour sign seems to be Aquarius\nElement: Air \nStrengths: Progressive, original, independent, humanitarian\nWeaknesses: Runs from emotional expression, temperamental, uncompromising, aloof");
		tree.root.middle2.left.middle2 = new Node("\nYour sign seems to be Aquarius\nElement: Air \nStrengths: Progressive, original, independent, humanitarian\nWeaknesses: Runs from emotional expression, temperamental, uncompromising, aloof");

		tree.root.middle2.middle1.left = new Node("\nYour sign seems to be Gemini\nElement: Air \nStrengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\nWeaknesses: Nervous, inconsistent, indecisive");
		tree.root.middle2.middle1.middle1 = new Node("\nYour sign seems to be Gemini\nElement: Air \nStrengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\nWeaknesses: Nervous, inconsistent, indecisive");
		tree.root.middle2.middle1.middle2 = new Node("\nYour sign seems to be Gemini\nElement: Air \nStrengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas\nWeaknesses: Nervous, inconsistent, indecisive");

		tree.root.middle2.middle2.left = new Node("\nYour sign seems to be Libra\nElement: Air \nStrengths: Cooperative,diplomatic, gracious, fair-minded, social \nWeaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity");
		tree.root.middle2.middle2.middle1 = new Node("\nYour sign seems to be Libra\nElement: Air \nStrengths: Cooperative,diplomatic, gracious, fair-minded, social \nWeaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity");
		tree.root.middle2.middle2.middle2 = new Node("\nYour sign seems to be Libra\nElement: Air \nStrengths: Cooperative,diplomatic, gracious, fair-minded, social \nWeaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity");

		//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		tree.root.right = new Node("I feel like I am an emotionally stable person.\n1.Strongly agree 2. Agree 3.Kinda disagree");
		tree.root.right.left = new Node("I am a master of self-control and have the ability to lead the way and manage many people who work for them at any time. \n1.Strongly agree 2. Agree 3.Kinda disagree");
		tree.root.right.middle1 = new Node("I believe in learning from my own mistakes and getting to the top based on my own experience.\n1.Strongly agree 2. Agree 3.Kinda disagree");
		tree.root.right.middle2 = new Node("I think efficiency is the key for every work that I do.\n1.Strongly agree 2. Agree 3.Kinda disagree");

		tree.root.right.left.left = new Node("\nYour sign seems to be Capricorn\nElement: Earth\nStrengths:Responsible,Disciplined,Self Contorlled\nWeaknesses:Unforgiving,Condescending,Know-it-All");
		tree.root.right.left.middle1 = new Node("\nYour sign seems to be Capricorn\nElement: Earth\nStrengths:Responsible,Disciplined,Self Contorlled\nWeaknesses:Unforgiving,Condescending,Know-it-All");
		tree.root.right.left.middle2 = new Node("\nYour sign seems to be Capricorn\nElement: Earth\nStrengths:Responsible,Disciplined,Self Contorlled\nWeaknesses:Unforgiving,Condescending,Know-it-All");

		tree.root.right.middle1.left = new Node("\nYour sign seems to be Taurus\nElement: Earth\n Strengths: Reliable, patient, practical, devoted, responsible, stable Weaknesses: Stubborn, possessive, uncompromising");
		tree.root.right.middle1.middle1 = new Node("\nYour sign seems to be Taurus\nElement: Earth\n Strengths: Reliable, patient, practical, devoted, responsible, stable Weaknesses: Stubborn, possessive, uncompromising");
		tree.root.right.middle1.middle2 = new Node("\nYour sign seems to be Taurus\nElement: Earth\n Strengths: Reliable, patient, practical, devoted, responsible, stable Weaknesses: Stubborn, possessive, uncompromising");

		tree.root.right.middle2.left = new Node("\nYour sign seems to be Virgo\nElement: Earth\nStrengths: Loyal, analytical, kind, hardworking, practical\nWeaknesses: Shyness, worry, overly critical of self and others, all work and no play");
		tree.root.right.middle2.middle1 = new Node("\nYour sign seems to be Virgo\nElement: Earth\nStrengths: Loyal, analytical, kind, hardworking, practical\nWeaknesses: Shyness, worry, overly critical of self and others, all work and no play");
		tree.root.right.middle2.middle2 = new Node("\nYour sign seems to be Virgo\nElement: Earth\nStrengths: Loyal, analytical, kind, hardworking, practical\nWeaknesses: Shyness, worry, overly critical of self and others, all work and no play");

	}

	public void display_zodiac() //displaying nodes of zodiac tree
	{

		Node ptr = root;
		System.out.println("\nEnter the option you relate to the most: ");
		while (ptr!=null)
		{
			System.out.println(ptr.data);
			if(ptr.left==null && ptr.middle1==null && ptr.middle2==null)
			{
				System.out.println("=========================================================================================");  
				return;
			}
			Scanner input = new Scanner(System.in);
			int element = input.nextInt();
			if(element == 1)
			{
				ptr = ptr.left;
			}
			else if(element == 2)
			{
				ptr = ptr.middle1;
			}
			else if(element == 3)
			{
				ptr = ptr.middle2;
			}
			else
			{
				ptr = ptr.right;
			}
		}
	}
}

public class Main  //Main class
{  
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		binarytree tree = new binarytree(); //creating object of binary tree class
		int ch,no=0;
		Zodiac z = new Zodiac();//creating object of zodiac class
		do{
			System.out.println("=========================================================================================");  
			System.out.println("\nWELCOME TO THE QUIZ PORTAL\nCHOOSE A FUN QUIZ TO ENGAGE IN\n1.DETERMINE IF YOU ARE A LEFT-BRAINED OR A RIGHT-BRAINED PERSON\n2.WHICH ZODIAC SIGN DO I TRULY BELONG TO?\n3.EXIT");
			System.out.println("=========================================================================================");
			System.out.println("\nENTER YOUR CHOICE:");
			ch=sc.nextInt();
			if(ch!=1&&ch!=2&&ch!=3)
			{
				System.out.println("You Entered Invalid Option");
			}
			switch(ch)
			{
			case 1:tree.create_leftRight(tree);
			tree.display_leftRight();
			tree.count();
			break;
			case 2:z.create_zodiac(z);
			z.display_zodiac();
			break;
			case 3:System.out.println("Exit");
			break;
			}
			System.out.println("WOULD YOU LIKE TO PLAY AGAIN?\n(1.YES  2.NO)");
			no=sc.nextInt();

		}while(no==1);
	}
}
/*Output:
=========================================================================================

WELCOME TO THE QUIZ PORTAL
CHOOSE A FUN QUIZ TO ENGAGE IN
1.DETERMINE IF YOU ARE A LEFT-BRAINED OR A RIGHT-BRAINED PERSON
2.WHICH ZODIAC SIGN DO I TRULY BELONG TO?
3.EXIT
=========================================================================================

ENTER YOUR CHOICE:
1
=========================================================================================

 *** Left-Right Brain Quiz ***
=========================================================================================

Do you seek logic in everything ?
1.Yes  2.No
1
Are you good at critical thinking?
1.Yes  2.No
3
You entered invalid option
Are you good at critical thinking?
1.Yes  2.No
1
Do you enjoy doing maths?
1.Yes  2.No
2
When you meet a new person do you recognize their faces rather than their names?
1.Yes  2.No
2
During school days, did you enjoy doing craft?
1.Yes  2.No
1
=========================================================================================


Here we go!
This is your result!!

Based on your answers,it seems you are Left-brained.
You insist on looking at straight-up facts when making decisions.
You don't tend to let your emotions get the best of you.
Your friends and family members would describe you as a 'analytical' and 'orderly' person.

=========================================================================================
WOULD YOU LIKE TO PLAY AGAIN?
(1.YES  2.NO)
1
=========================================================================================

WELCOME TO THE QUIZ PORTAL
CHOOSE A FUN QUIZ TO ENGAGE IN
1.DETERMINE IF YOU ARE A LEFT-BRAINED OR A RIGHT-BRAINED PERSON
2.WHICH ZODIAC SIGN DO I TRULY BELONG TO?
3.EXIT
=========================================================================================

ENTER YOUR CHOICE:
1
=========================================================================================

 *** Left-Right Brain Quiz ***
=========================================================================================

Do you seek logic in everything ?
1.Yes  2.No
1
Are you good at critical thinking?
1.Yes  2.No
1
Do you enjoy doing maths?
1.Yes  2.No
2
When you meet a new person do you recognize their faces rather than their names?
1.Yes  2.No
2
During school days, did you enjoy doing craft?
1.Yes  2.No
2
=========================================================================================


Here we go!
This is your result!!

Based on your answers,it seems you are Right-brained.
You are good at projecting your emotions and are rather focused on art and creativity.
Imagination predominates your brain but you tend to get occasionally absent-minded.

=========================================================================================
WOULD YOU LIKE TO PLAY AGAIN?
(1.YES  2.NO)
1
=========================================================================================

WELCOME TO THE QUIZ PORTAL
CHOOSE A FUN QUIZ TO ENGAGE IN
1.DETERMINE IF YOU ARE A LEFT-BRAINED OR A RIGHT-BRAINED PERSON
2.WHICH ZODIAC SIGN DO I TRULY BELONG TO?
3.EXIT
=========================================================================================

ENTER YOUR CHOICE:
2
=========================================================================================

			 **Let's guess your Zodiac sign!** 

=========================================================================================


Enter the option you relate to the most: 

Choose your element 
1.Fire 2.Water 3.Air 4.Earth
2

I am moved to tears by sad movies or stories.
1.Strongly agree 2. Agree 3.Kinda disagree
1

I never betray my loved ones.
1.Strongly agree 2. Agree 3.Kinda disagree
1



Your sign seems to be Cancer
Element: Water 
Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive
Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure

=========================================================================================

WOULD YOU LIKE TO PLAY AGAIN?
(1.YES  2.NO)
2

 */

