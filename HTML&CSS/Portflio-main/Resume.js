// const menu=document.querySelector(".menu")
// menu.addEventListener("onclick",()=>{
//    const aside=document.querySelector(".aside-container")
//     if(aside.style.display==="none"){
//         aside.style.display="flex"
//         console.log( aside.style.display)
//     }
//     else{
//         aside.style.display="none" 
//     }
// })
// window.addEventListener('scroll',()=>{
    const main=document.querySelector(".main-container")
    const switcher=document.querySelector(".switcher")
function addclass(){
    
  
    switcher.querySelector("i").classList.toggle('fa-sun');
    switcher.querySelector("i").classList.toggle('fa-moon');
    main.classList.toggle('white')
}  
window.addEventListener("load",() =>{
    if(main.classList.contains("white")){
        switcher.querySelector("i").classList.add("fa-moon")
    }
    else{
        switcher.querySelector("i").classList.add("fa-sun")

    }
})  
//     const aside=document.querySelector(".aside-container")
//     const head=document.querySelector(".heading")
//     const main=document.querySelector(".main-container")
//     const flex=document.querySelector(".home-main")
//     if(aside.style.display==="flex"){
//             head.style.display="block"
//             aside.style.display="none" 
//             flex.style.flexDirection="row"
//              main.style.paddingLeft="0px"
//              console.log( aside.style.display)
//             }
// })

// function menufun(){
//     const aside=document.querySelector(".aside-container")
//     const head=document.querySelector(".heading")
//     const main=document.querySelector(".main-container")
//     const flex=document.querySelector(".home-main")
//       if(aside.style.display==="none"){
//             head.style.display="none"
//             flex.style.flexDirection="column-reverse"
            
           
//             aside.style.display="flex"
//             // menu.classList.toggle("left")
//             main.style.paddingLeft="200px"
//             console.log( aside.style.display)
//         }
//         else{
//             head.style.display="flex"
//             aside.style.display="none" 
//             flex.style.flexDirection="row"
//              main.style.paddingLeft="0px"
//         }
  
    
// }
// function fun(){
//     const aside=document.querySelector(".aside-container")
//     const main=document.querySelector(".main-container")
//     if(aside.style.width==="170px"){
//        main.style.paddingLeft="170px"
//        console.log(aside.style.width)
//     }
//     console.log(aside.style.width)
//  }
        