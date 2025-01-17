from tkinter import *
from tkinter import ttk
from tkinter import messagebox
from MysqlConnecter import DataBase
root=Tk()
root.title("My Friends Details Management")
# create window
root.geometry('1300x750+0+0')
# set color in window
root.config(bg='#2c3e50')

name=StringVar()
age=StringVar()
DOB=StringVar()
gender=StringVar()
email=StringVar()
phone=StringVar()
# Entries frame
entries_frame=Frame(root,bg='#535c68')
entries_frame.pack(side=TOP,fill=X)
title=Label(entries_frame,text='Friends Management System',font=('nimbus mono ps',18,'bold'),bg='#535c68',fg='White')
title.grid(row=0,columnspan=2,padx=10,pady=20)

lbl_name=Label(entries_frame,text='Name ',font=('nimbus mono ps',15),bg='#535c68',fg='White')
lbl_name.grid(row=1 ,column=0,padx=10,pady=10,sticky='w')
txt_name=Entry(entries_frame,textvariable=name,font=('nimbus mono ps',16),width=25)
txt_name.grid(row=1,column=1,padx=10,pady=10,sticky='w')

lbl_age=Label(entries_frame,text='Age ',font=('nimbus mono ps',15),bg='#535c68',fg='White')
lbl_age.grid(row=1 ,column=3,padx=10,pady=10,sticky='w')
txt_age=Entry(entries_frame,textvariable=age,font=('nimbus mono ps',16),width=25)
txt_age.grid(row=1,column=4,padx=10,pady=10,sticky='w')

lbl_DOB=Label(entries_frame,text='DOB ',font=('nimbus mono ps',15),bg='#535c68',fg='White')
lbl_DOB.grid(row=2 ,column=0,padx=10,pady=10,sticky='w')
txt_DOB=Entry(entries_frame,textvariable=DOB,font=('nimbus mono ps',16),width=25)
txt_DOB.grid(row=2,column=1,padx=10,pady=10,sticky='w')

lbl_email=Label(entries_frame,text='Email',font=('nimbus mono ps',15),bg='#535c68',fg='White')
lbl_email.grid(row=2 ,column=3,padx=10,pady=10,sticky='w')
txt_email=Entry(entries_frame,textvariable=email,font=('nimbus mono ps',16),width=25)
txt_email.grid(row=2,column=4,padx=10,pady=10,sticky='w')

lbl_gender=Label(entries_frame,text='Gender',font=('nimbus mono ps',15),bg='#535c68',fg='White')
lbl_gender.grid(row=3 ,column=0,padx=10,pady=10,sticky='w')
com_gender=ttk.Combobox(entries_frame,font=('nimbus mono ps',15),width=26,textvariable=gender,state='readonly')
com_gender.grid(row=3,column=1,padx=10,pady=10,sticky='w')
com_gender['values']=('Male','Female')

lbl_phone=Label(entries_frame,text='Mobile',font=('nimbus mono ps',15),bg='#535c68',fg='White')
lbl_phone.grid(row=3 ,column=3,padx=10,pady=10,sticky='w')
txt_phone=Entry(entries_frame,textvariable=phone,font=('nimbus mono ps',16),width=25)
txt_phone.grid(row=3,column=4,padx=10,pady=10,sticky='w')

lbl_address=Label(entries_frame,text='Address',font=('nimbus mono ps',15),bg='#535c68',fg='White')
lbl_address.grid(row=4 ,column=0,padx=10,pady=10,sticky='w')
txt_address=Text(entries_frame,width=85,height=5,font=('nimbus mono ps',15))
txt_address.grid(row=5 ,column=0,columnspan=5,padx=10,sticky='w')

#button frame
btn_frame=Frame(entries_frame,bg='#535c68')
btn_frame.grid(row=6 ,column=0,columnspan=5,padx=10,pady=10,sticky='w')

db=DataBase()
def getData(event):
    selected_row=tv.focus()
    data=tv.item(selected_row)
    global row
    row=data['values']
    name.set(row[1])
    age.set(row[2])
    DOB.set(row[3])
    phone.set(row[5])
    email.set(row[4])
    gender.set(row[6])
    txt_address.insert(END,row[7])
    # print(row)
def DisplayAll():
   tv.delete(*tv.get_children())
   for data in db.FetchData:
    #    print(data)
       tv.insert("",END,values=data)


def Add_Friends():
    if txt_address.get(1.0,END)=='' or txt_name.get()=='' or txt_age.get()=='' or txt_DOB.get()=='' or com_gender.get()=='' or txt_phone.get()=='' or txt_email.get()=='' :
      messagebox.showerror("Error in input", "Fill All the details")
      return
    db.AddFriends(address=txt_address.get(1.0,END),name= txt_name.get(),age=txt_age.get(),DOB=txt_DOB.get(),gender=com_gender.get() ,phone=txt_phone.get() ,email=txt_email.get())
    messagebox.showinfo('success','Successfully Added...')
    Clear()
    DisplayAll()
def Update_Details():
    if txt_address.get(1.0,END)=='' or txt_name.get()=='' or txt_age.get()=='' or txt_DOB.get()=='' or com_gender.get()=='' or txt_phone.get()=='' or txt_email.get()=='' :
      messagebox.showerror("Error in input", "Select")
      return
    db.Update_Details(id=row[0],address=txt_address.get(1.0,END),name= txt_name.get(),age=txt_age.get(),DOB=txt_DOB.get(),gender=com_gender.get() ,phone=txt_phone.get() ,email=txt_email.get())
    messagebox.showinfo('success','Successfully Updated...')
    Clear()
    DisplayAll()
def Clear():
    name.set('')
    age.set('')
    DOB.set('')
    phone.set('')
    email.set('')
    gender.set('')
    txt_address.delete(1.0,END)
def Delele_Details():
    if txt_address.get(1.0,END)=='' or txt_name.get()=='' or txt_age.get()=='' or txt_DOB.get()=='' or com_gender.get()=='' or txt_phone.get()=='' or txt_email.get()=='' :
      messagebox.showerror("Error in input", "Select Row")
      return
    db.Delete_Details(id=row[0])
    messagebox.showinfo('success','Successfully Deleted...')
    DisplayAll()
    Clear()
 
    
btn_add=Button(btn_frame,command=Add_Friends,text='Add Details',width=15,font=('nimbus mono ps',18,'bold'),bg='green',fg='white',bd=0).grid(row=0,column=0,padx=10,pady=10,sticky='w')
btn_add=Button(btn_frame,command=Update_Details,text='Update Details',width=15,font=('nimbus mono ps',18,'bold'),bg='blue',fg='white',bd=0).grid(row=0,column=1,padx=10,pady=10,sticky='w')
btn_add=Button(btn_frame,command=Clear,text='Clear',width=15,font=('nimbus mono ps',18,'bold'),bg='gray',fg='white',bd=0).grid(row=0,column=2,padx=10,pady=10,sticky='w')
btn_add=Button(btn_frame,command=Delele_Details,text='Delete Details',width=15,font=('nimbus mono ps',18,'bold'),bg='red',fg='white',bd=0).grid(row=0,column=3,padx=10,pady=10,sticky='w')


#style
style=ttk.Style()
style.configure('mystyle.Treeview',font=('nimbus mono ps',13),rowheight=50)
style.configure('mystyle.Treeview.Heading',font=('nimbus mono ps',15))
#Table frame

table_frame=Frame(root,bg='#ecf0f1')
table_frame.place(x=0,y=440,width=1300,height=300)
tv=ttk.Treeview(table_frame,columns=(1,2,3,4,5,6,7,8),style='mystyle.Treeview')
tv.heading('1',text='ID')
tv.column('1',width=10)
tv.heading('2',text='Name')
tv.column('2',width=80)
tv.heading('3',text='Age')
tv.column('3',width=10)
tv.heading('4',text='DOB')
tv.column('4',width=70)
tv.heading('5',text='Email')
tv.heading('7',text='Gender')
tv.column('7',width=10)
tv.heading('6',text='Phone')
tv.column('6',width=80)
tv.heading('8',text='Address')
tv.pack(fill=X)
tv.bind('<ButtonRelease-1>',getData)
tv['show']='headings'

DisplayAll()
root.mainloop()

