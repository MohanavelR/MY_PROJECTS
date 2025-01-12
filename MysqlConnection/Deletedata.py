from Mysqlconnect import mysql


def DeleteData(id):
    connect=mysql.cursor()
    sql ='delete from user where id=%s'
    connect.execute(sql,(id,))
    mysql.commit()
    connect.close()
    print("Deleted Successfully")