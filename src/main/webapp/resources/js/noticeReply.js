const reply = document.querySelector("#reply");
const num = document.querySelector("#num");
const writer = document.querySelector("#writer");
const contents = document.querySelector("#contents");
const replyResult = document.querySelector("#replyResult");
const del=document.querySelectorAll(".del");

//update
replyResult.addEventListener("click",function(event){
    if(event.target.clasList.contains('update')){
        //console.log(event.target.parentNode.previousSibling.previousSibling.previousSibling.previousSibling);
        let num = event.target.getAttribute('data=index');
        let replyNum=document.querySelector("#up"+num);
        let text = replyNum.innerText;
        let tx = document.createElement('textarea');
        tx.setAttribute("id","update"+replyNum);
        replyNum.innerHTML=tx;
        console.log('update');
    }
})

replyResult.addEventListener("change",function(event){
    
})


//delete
replyResult.addEventListener("click",function(event){
    if(event.target.classList.contains('del')){
        let replyNum= event.target.getAttribute("data-num")
        const xhttp = new XMLHttpRequest();
        xhttp.open("POST","../noticeReply/delete");
        xhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded")
        xhttp.send("replyNum="+replyNum);
        xhttp.onreadystatechange=function(){
            if(this.readyState==4&&this.status==200){
                if(this.responseText.trim=='1'){
                    alret('삭제성공')
                    getList();
                }else{
                    alret('삭제실패')
                }
            }
        }

    }
})


result1();

function result1(){
    const xhttp2 = new XMLHttpRequest();
    xhttp2.open("GET","../noticeReply/list?num="+num.value);
    xhttp2.send();
    xhttp2.onreadystatechange=function(){
        if(this.readyState==4 &&this.status==200){
            console.log(this.responseText.trim());
            replyResult.innerHTML=this.responseText.trim();
        }
    }
    
}


reply.addEventListener("click",function(){
    console.log(num.value);
    console.log(writer.value);
    console.log(contents.value);
    //js에서 요청객체생성(준비)
    const xhttp = new XMLHttpRequest();
    //요청 정보 입력
    //open(method형식,url주소)
    xhttp.open("POST","../noticeReply/add");
    //요청 header정보
    xhttp.setRequestHeader("Content-type","application/x-www-form-urlencoded")
    //요청전송
    xhttp.send("num="+num.value+"&writer="+writer.value+"&contents="+contents.value);
    //응답처리
    xhttp.onreadystatechange=function(){
        if(this.readyState==4&&this.status==200){
            console.log(this.responseText);
            let result = this.responseText.trim();
            if(result=="1"){
                alert('댓글이 등록 되었습니다.')
                result1();
            }else{
                alert("댓글등록이 실패");
            }
        }
    }
});