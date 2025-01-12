

let answer=document.getElementById('answer')
let btn=document.querySelector('button')
btn.addEventListener('click',Show)
 function Show(){
    
    let input=document.getElementById("input") 
    let population=0,rate=0,lang='';
    let optvalue=input.options[input.selectedIndex].value 
    switch (optvalue){
        case 'Chennai':
         population=765432
         rate =90.02
         lang='tamil'
         break  
         case 'Bengaluru':
            population=11765432
            rate =89.03
            lang='Kannada'
            break  
        case 'Mumbai':
                population=13765432
                rate =87.02
                lang='Marathi'
                break  
         case 'Delhi':
         population=152765432
         rate =90.02
         lang='Hindi'
         break               
    }
   answer.innerHTML=`The Indian City Of ${optvalue} has a ${population}.Languages spoken is ${lang} and literacy rate is ${rate}`

 }
