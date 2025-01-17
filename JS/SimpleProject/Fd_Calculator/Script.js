function Convert(){
    let input=document.getElementById("input")
    let answer=document.getElementById('answer')
    let inputvalue=Number(input.value)
    let rate =0
      if (inputvalue>=10){
         rate=7
      }
      else if(inputvalue>=7 && inputvalue<=9){
           rate=6.8 
      }
      else if(inputvalue>=3 && inputvalue<=6){
         rate=6.5    
      }
      else if(inputvalue<3){
          rate=5.8
      }
      answer.innerHTML=`Your Interest is ${rate}%`

}