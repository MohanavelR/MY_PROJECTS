function Calculate(){
    let input=document.getElementById("input")
    let answer=document.getElementById('answer')
    let inputvalue=(input.value.length)
    if (inputvalue<=1){
        answer.innerHTML=inputvalue +" Word"
    }
    else{
         answer.innerHTML=inputvalue +" Words"
    }

   
}