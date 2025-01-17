let hour=document.getElementById('hourid')
let min=document.getElementById('minid')
let sec=document.getElementById('secid')

function Timer(){
    let time=new Date()
    let currhour=time.getHours()  
    let currmin=check(time.getMinutes())
    let currsec=check(time.getSeconds())
    
    
    if (currhour>12){
        currhour=currhour-12
    }
    hour.innerHTML=check(currhour)
    min.innerHTML=currmin
    sec.innerHTML=currsec
    mill.innerHTML=currmill
}
function check(n){
     if(n>=10){
        return n
     }
     else{
        return '0'+n
     }
}

setInterval(Timer,500)