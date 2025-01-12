import math
user_value=input('Enter value :')
if user_value.isdigit() :
    user_value=int(user_value)
else:    
   print('This Charactor...')
   exit()
binay_form=''   
while True:
    module=user_value%2
    divate=user_value/2
   
    print(binay_form)
    if divate==1:
         binay_form+=str(int(divate))
         break
    elif divate==0:
         break
    else:
        binay_form+=str(module)
        user_value=math.floor(divate)
print("Your Value is :",binay_form[::-1].rjust(16,'0'))    