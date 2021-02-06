import CountUI from '../../components/Count'
// import store from '../../redux/store'
import {createIncrementAction,createDecrementAction,createIncrementAsyncAction} from '../../redux/count_action'
import {connect} from 'react-redux'
function mapStateToProps (state){
    return {count:state}
}
function mapDispatchToProps (dispatch){
    return {
        add:(data)=>{
            dispatch(createIncrementAction(data))
        },

        minus:(data)=>{
            dispatch(createDecrementAction(data))
        },
        addAsync:(data,time)=>{
            dispatch(createIncrementAsyncAction(data,time))

        }
    }
}

const CountContainer = connect(mapStateToProps,mapDispatchToProps)(CountUI)

export default CountContainer