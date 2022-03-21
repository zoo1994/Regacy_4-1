const fileAdd = document.getElementById("fileAdd");
const fileResult = document.getElementById("fileResult");
const del = document.getElementsByClassName("del");

let count = 0;
let num = 0;

fileAdd.addEventListener("click",function(){
    
    

    if(count>4){
        alert('첨부파일은 최대 5개까지만 등록가능');
        return;
    }


    let div = document.createElement("div"); //<div></div>
    div.setAttribute("id","del"+num);
 
    
    let file = document.createElement("input");//<input>
    file.setAttribute("type","file");          //<input type="file">
    file.setAttribute("name", "files");         //<input type="file" name="files">
    div.append(file);
    
    let button = document.createElement('button');
    button.setAttribute("type","button");
    button.className="del";
    button.setAttribute("data-num","del"+num);
    button.innerHTML="del";


    div.append(button);

    fileResult.append(div);

    num++;
    count++;
    // let del = document.createAttribute("button");
    // del.setAttribute("type","button");
    // fileResult.append(del);
})

fileResult.addEventListener("click",function(event){
    let cn = event.target;

    if(cn.classList.contains('del')){
        let delNum=cn.getAttribute("data-num");
        document.getElementById(delNum).remove();
        count--;
    }
    
})
