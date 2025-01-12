from Mysqlconnect import mysql

def SelectData():
    connect=mysql.cursor(dictionary=True)
    sql ='select * from user'
    connect.execute(sql)
    data=connect.fetchall()
    mysql.commit()
    # connect.close()
    return data