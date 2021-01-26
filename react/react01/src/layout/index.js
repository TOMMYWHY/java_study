import React from "react";
import { Layout , Menu,Icon} from 'antd';
import Link from 'umi/link';


const { Header, Footer, Sider, Content } = Layout;
const SubMenu = Menu.SubMenu;


class BasicLayout extends React.Component{
    state = {
        collapsed: false,
    };

    render() {
        return(
            <Layout>
                <Sider width={256} sytle={{minHeight:'100vh',color:'white'}}>
                    <div sytle={{height:'32px',background:'rgba(255,255,255,.2)',margin:'16px'}}></div>
                    <Menu
                        defaultSelectedKeys={['1']}
                        defaultOpenKeys={['sub1']}
                        mode="inline"
                        theme="dark"
                        inlineCollapsed={this.state.collapsed}
                    >
                        <Menu.Item key='11'>
                            <Icon type='pie-chart' /><span>option 1</span>
                        </Menu.Item>
                        <Menu.Item key='22'>
                            <Icon type='desktop' /><span>option 2</span>
                        </Menu.Item>
                        <Menu.Item key='33'>
                            <Icon type='index' /><span>option 3</span>
                        </Menu.Item>
                        <SubMenu key='sub1' title={<span><Icon type='user'></Icon> <span>user management </span></span>}>
                            <Menu.Item key='1'> <Link to="/user/UserAdd"> Add User</Link></Menu.Item>
                            <Menu.Item key='2'> <Link to="/user/UserList">User List</Link> </Menu.Item>
                        </SubMenu>
                        <SubMenu key='sub2' title={<span><Icon type='appstore'></Icon> <span>navigation two</span></span>}>
                            <Menu.Item key='8'>option 8</Menu.Item>
                            <Menu.Item key='9'>option 9</Menu.Item>
                            <Menu.Item key='10'>option 10</Menu.Item>
                            <SubMenu key='sub3' title='submenu'>
                                <Menu.Item key='11'>option 11</Menu.Item>
                                <Menu.Item key='12'>option 12</Menu.Item>
                            </SubMenu>
                        </SubMenu>
                    </Menu>
                </Sider>
                <Layout>
                    <Header sytle={{background:'#fff',textAlign:'center',padding:0}}>Header</Header>
                    <Content sytle={{margin:'24px 16 px 0'}}>
                        <div style={{padding:24, background:'#fff', minHeight:360}}>
                            {this.props.children}
                        </div>
                    </Content>
                    <Footer style={{textAlign:'center'}}>Footer</Footer>
                </Layout>
            </Layout>
        )
    }
}

export default BasicLayout;
