import random
import enum
import argparse
import time
parser=argparse.ArgumentParser(
    description='this a name'
)
parser.add_argument(
"-n","--name",metavar='name',
required=True,help="Enter Your Name :"
)
args=parser.parse_args()

class options(enum.Enum):
    ROCK = 1
    PAPER=2
    SCISSOR=3
def Show(c,y):
    print("Your Choice    :",options(int(y)).name)
    print("Computer Choice:",options(int(c)).name)      
                    

def Start_game(name):
    name=name
    Win=0
    lost=0
    die=0
    count=0
    def Conform():

      while True :
             nonlocal name             
             play=input("Conform Exit (yes/no)(y/n):").lower()
             if play=='y' or play=='yes':
                    print("Total Match        :",count)
                    print("Match Die          :",die)
                    print("You Win Match      :",Win)
                    print("Computer Win Match :",lost)
                    exit(0)
             elif play=='n' or play=='no':
                  Play_game(name)
             else:
                  continue       

    def Play_game(name):
      nonlocal Win
      nonlocal lost
      nonlocal die
      nonlocal count      
      while True:
           count+=1
           print('''
                    1.Rock
                    2.Paper
                    3.scissor
                    4.exit(0) 
                 ''')
           computer_choice=str(random.randint(1,3))
           while True:
                 Your_choice=input("Enter Your Choice :")
                 if Your_choice==computer_choice:
                      Show(Your_choice,computer_choice)
                      print('Match die....')
                      die+=1                                     
                      break
                 elif computer_choice=='3' and  Your_choice  =='1':
                       Show(Your_choice,computer_choice)
                       print("You Win",name)
                       Win+=1
                       break
                 elif computer_choice=='2' and Your_choice=='1':
                       Show(Your_choice,computer_choice)
                       print("You Win",name) 
                       Win+=1                  
                       break
                 elif computer_choice=='2' and Your_choice=='3':
                       Show(Your_choice,computer_choice)
                       print("You Win",name) 
                       Win+=1
                       break
                 elif computer_choice=='1' and  Your_choice  =='3':
                       Show(Your_choice,computer_choice)
                       print("You Lost",name)
                       lost+=1
                       
                       break
                 elif computer_choice=='1' and Your_choice=='2':
                       Show(Your_choice,computer_choice)
                       print("You Lost",name)
                       lost+=1
                       break
                 elif computer_choice=='3' and Your_choice=='2':
                         Show(Your_choice,computer_choice)                     
                         print("You Lost",name)
                         lost+=1
                         break
                 elif Your_choice=='4':
                       count-=1
                       Conform()
                       
                       print("Total Match        :",count)
                       print("Match Die          :",die)
                       print("You Win Match      :",Win)
                       print("Computer Win Match :",lost)
                      
                 else:
                       print("Invailed Choice. please Enter correct choice.....")
    Play_game(name)
if __name__=="__main__":
        print("Hello ",args.name)
        time.sleep(1)
        print("WelCome to Game ....")
        time.sleep(2)
        print("Loading.......")     
        time.sleep(2)                  
        Start_game(args.name)