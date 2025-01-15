/*=================================== toggle style switcher ================================= */
const styleSwitcherToggle=document.querySelector(".style-switcher-toggler");
styleSwitcherToggle.addEventListener("click",() =>{
    document.querySelector(".style-switcher").classList.toggle("open");

})
//hide stylw switcher on scroll
window.addEventListener("scroll",() =>{
    if(document.querySelector(".style-switcher").classList.contains("open")){

        document.querySelector(".style-switcher").classList.remove("open");

    }
})
/*=================================== theme colors ================================= */
const alternateStyle=document.querySelectorAll('.alternate-style');
function setActiveStyle(color){
    alternateStyle.forEach((style) =>{
        if(color===style.getAttribute("title")){
            style.removeAttribute("disabled")
        }
        else{
            style.setAttribute("disabled","true");
        }

    })

}
/*=================================== theme light and dark  colors ================================= */
const dayNight=document.querySelector('.day-night');
dayNight.addEventListener('click',() =>{
    dayNight.querySelector("i").classList.toggle('fa-sun');
    dayNight.querySelector("i").classList.toggle('fa-moon');
    document.body.classList.toggle('dark')
})
window.addEventListener("load",() =>{
    if(document.body.classList.contains("dark")){
        dayNight.querySelector("i").classList.add("fa-sun")
    }
    else{
        dayNight.querySelector("i").classList.add("fa-moon")

    }
})
//=========================================================================
function menufun(){
        const aside=document.querySelector(".aside")
     
                aside.classList.toggle("toggle")
            }
//==========================================================================    
    window.addEventListener("scroll",() =>{
        const aside=document.querySelector(".aside")
        
          if(aside.classList.contains("toggle")){
                aside.classList.remove("toggle")
              
               
            }
           
      
        
    }
    )
//==========================================================================


