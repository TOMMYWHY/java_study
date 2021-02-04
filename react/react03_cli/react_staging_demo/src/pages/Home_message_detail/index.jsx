import React, { Component } from 'react'
const DetailData= [
    {id:'01',content:"aaaaa"},
    {id:'02',content:"bb"},
    {id:'03',content:"ccccccccccccc"},
]

export default class Detail extends Component {
    render() {
        console.log(this.props);
        const {id,title} = this.props.match.params
        const findResult = DetailData.find((detailObj)=>{
            return id===detailObj.id
        })
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
