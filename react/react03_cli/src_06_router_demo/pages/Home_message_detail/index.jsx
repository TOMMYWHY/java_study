import React, { Component } from 'react'
import qs from 'querystring'


const DetailData= [
    {id:'01',content:"aaaaa"},
    {id:'02',content:"bb"},
    {id:'03',content:"ccccccccccccc"},
]



export default class Detail extends Component {
    render() {
        console.log(this.props);
        // const{id,title} =this.props.location.state


        /* search */
        // const{search} = this.props.location
        // const{id,title} = qs.parse(search.slice(1))


        
        /* params */

        const {id,title} = this.props.match.params
        const findResult = DetailData.find((detailObj)=>{
            return detailObj.id ===id
        })
        console.log(findResult);
        return (
            <div>
                <ul>
                    <li>id:{id}</li>
                    <li>title:{title}</li>
                    <li>content:{findResult.content}</li>
                </ul>
            </div>
        )
    }
}
