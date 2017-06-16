/**
 * Created by 985649 on 6/15/2017.
 */

(function(global) {
        var recoClient = {
            version : '0.0.1',
            config:{
                url:"",

            },
            query:function(data){
                var job= function(url,request,handler){
                  //ajax goes here
                    var xhttp = new XMLHttpRequest();
                    xhttp.onreadystatechange=function(){
                        if(this.readyState == 4 &&this.status==200){
                            handler(JSON.parse(this.responseText));
                        }
                    }
                    xhttp.open("GET",url,true);

                    xhttp.send({
                        getMe:data
                    });
                };
                if(recoClient.handler!=null){
                    job(recoClient.url,data,recoClient.handler);
                }else{
                    console.error("Handler function is not defined");
                    throw new Error("Handler not defined");
                }
            },
            handler:function(response){
                console.log("Run loop on response");
            }
        };
        if(global.recoClient){
            throw new Error("Client already defined");
        }
        else{
            global.recoClient = recoClient;
        }
    })(typeof window ==="undefined"?this : window);

