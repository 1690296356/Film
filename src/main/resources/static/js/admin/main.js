/*<![CDATA[*/
function logout(){
    $.messager.confirm("系统提示","您确定要退出系统吗？",function(r){
        if(r){
            window.location.href="/logout";
        }
    });
}

function openTab(text,url,iconCls){
    if($("#tabs").tabs("exists",text)){
        $("#tabs").tabs("select",text);
    }else{
        var content="<iframe frameborder=0 scrolling='auto' style='width:100%;height:99.6%' src='"+url+"'></iframe>";
        $("#tabs").tabs("add",{
            title:text,
            iconCls:iconCls,
            closable:true,
            content:content
        });
    }
}
/*]]>*/