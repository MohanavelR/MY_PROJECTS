from Mysqlconnect import mysql

def InsertData(name,age,city):
    connect=mysql.cursor(dictionary=True)
    sql ='insert into user(name,age,city) values (%s,%s,%s)'
    connect.execute(sql,(name,age,city))
    mysql.commit()
    connect.close()
    print("Insert Successfully")