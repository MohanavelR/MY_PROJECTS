import mysql.connector
class DataBase():
    def __init__(self):
        self.mysql=mysql.connector.connect(host='localhost',
                                    user='root',
                                    password='',
                                    database='friends')
        self.connection=self.mysql.cursor()
    @property
    def FetchData(self):
        sql='select * from friends'
        self.connection.execute(sql)
        data_Values=self.connection.fetchall()
        # self.mysql.commit()
        # self.connection.close()
        return data_Values
    def AddFriends(self,name,age,DOB,email,phone,gender,address):
          sql ='insert into friends(name,age,DOB,email,phone,gender,address) values (%s,%s,%s,%s,%s,%s,%s)'
          self.connection.execute(sql,(name,age,DOB,email,phone,gender,address))
        #   self.mysql.commit()
        #   self.connection.close()    
    def Update_Details(self,name,age,DOB,email,phone,gender,address,id):     
         sql='update friends set name=%s,age=%s,DOB=%s,email=%s,phone=%s,gender=%s,address=%s  where id=%s'
         self.connection.execute(sql,(name,age,DOB,email,phone,gender,address,id))
        #  self.mysql.commit()
        #  self.connection.close()
    def Delete_Details(self,id):
            sql ='delete from friends where id=%s'
            self.connection.execute(sql,(id,))
            # self.mysql.commit()
            # self.connection.close()     







'''
             create table friends(
             id int auto_increment primary key,
             name varchar(100),
             age int,
             DOB  varchar(50),
             email varchar(100),
             phone varchar(50),
             gender varchar(20),
             address varchar(500)
             );

        '''
