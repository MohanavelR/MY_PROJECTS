from Mysqlconnect import mysql

def UpdateData(id,name,age,city):
    connect=mysql.cursor(dictionary=True)
    sql ='update user set name=%s,age=%s,city=%s  where id=%s'
    connect.execute(sql,(name,age,city,id))
    mysql.commit()
    connect.close()
    print("Updated Sucessfully.....")
    