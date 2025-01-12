from flask import Flask,flash,render_template,redirect,request,url_for
import mysql.connector

app=Flask(__name__)
mysql=mysql.connector.connect(
    host='localhost',
    user='root',
    password='',
    database='student'
)
app.secret_key='mohan123'
@app.route('/')
def Index():
    connect=mysql.cursor(dictionary=True)
    sql ='select * from user'
    connect.execute(sql)
    datas=connect.fetchall()
    mysql.commit()
    connect.close()    
    return render_template('Index.html',datas=datas)
@app.route('/adduser',methods=['POST',"GET"])
def adduser():
   if request.method=="POST":
      name=request.form['name']
      age=request.form['age']
      city=request.form['city']
      connect=mysql.cursor(dictionary=True)
      sql ='insert into user(name,age,city) values (%s,%s,%s)'
      connect.execute(sql,(name,age,city))
      mysql.commit()
      connect.close()   
      flash('Add User Successfully')
      return redirect(url_for('Index'))   
   return render_template('Adduser.html')
@app.route('/edit/<string:id>',methods=['POST',"GET"])
def EditUser(id):
    connect=mysql.cursor(dictionary=True)
    sql ='select * from user where id =%s'
    connect.execute(sql,(id,))
    datas=connect.fetchone()
    mysql.commit()
    connect.close()  
    if request.method=="POST":
      name=request.form['name']
      age=request.form['age']
      city=request.form['city']   
      connect=mysql.cursor(dictionary=True)
      sql ='update user set name=%s,age=%s,city=%s  where id=%s'
      connect.execute(sql,(name,age,city,id))
      mysql.commit()
      connect.close()
      flash("Updated Sucessfully") 
      return redirect(url_for('Index'))    
    return render_template('Edituser.html',datas=datas)
@app.route('/Delete/<string:id>')
def DeleteUser(id):
    connect=mysql.cursor()
    sql ='delete from user where id=%s'
    connect.execute(sql,(id,))
    mysql.commit()
    connect.close()
    flash("Deleted Successfully") 
    return redirect(url_for('Index'))    
if __name__=='__main__':
  app.run(debug=True)
