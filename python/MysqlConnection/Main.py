from Deletedata import DeleteData
from InsertData import InsertData
from SelectData import SelectData
from Update import UpdateData

while True:
    print("""
            1.Select
            2.Insert
            3.Update
            4.Delete
            'Q' Quit
""")
    choice=input("Enter Your Choice :")
    if choice=='1':
        data=SelectData()
        for i in data:
            print('Data :',i)
    elif choice=='2':
        name=input("Enter Your Name :")
        age=input("Enter Your Age :")
        city=input("Enter Your city :")
        InsertData(name=name,age=age,city=city)
    elif choice=='3':
        id=input('Enter Your Id :')
        name=input("Enter Your Name :")
        age=input("Enter Your Age :")
        city=input("Enter Your city :")
        UpdateData(id=id,name=name,age=age,city=city)
    elif choice=='4':
        id=input('Enter Your Id :')
        DeleteData(id=id) 
    elif choice=='q' or choice=="Q":
        exit(0)
    else:
        print("Invailed Choice.... ")    




