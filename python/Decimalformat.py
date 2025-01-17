import math
user_value=input('Enter value :')
if  not user_value.isdigit():
    print("This Not a binary format")
decimal_value=0    
# print(user_value[-(len(user_value))])
# print(user_value[-(len(user_value)-1)])
# print(user_value[-(len(user_value)-2)])
# print(user_value[-(len(user_value)-3)])
add=0
for i in range(1,len(user_value)+1):
       if int(user_value[-(i)])==0 or int(user_value[-(i)])==1:
         value=(int(user_value[-(i)])*(2**add))
         add+=1
         decimal_value+=value
       else :
           print("This Not a binary format")  
           exit(0)
       
print("Decimal Value Is :",decimal_value)       