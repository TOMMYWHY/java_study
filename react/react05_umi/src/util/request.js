function checkStatus(response) {
    if(response.status>=200 && response.status<300){
        return response;
    }
    const err = new Error(response.statusText)
    err.response = response;
    throw err;

}

export  default async  function request (url,options){
    const response = await  fetch(url,options);
    checkStatus(response);
    return await  response.json()
}