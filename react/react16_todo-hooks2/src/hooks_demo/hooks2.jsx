import React, { useState, useEffect, useContext } from 'react'

const logger = (count) => {
    console.log(count);
}

export default () => {
    const [count, setCount] = useState(0)
    const addCount = () => {
        setCount(count => count + 1)
    }
    // useEffect(() => {
    //     console.log(count);
    // })

    useEffect(logger.bind(null, count), [count])
    const [theme, setTheme] = useState(themes.light)
    return (

        <div>
            <p>{count}</p>
            <button onClick={() => { addCount() }}>add</button>
            <br />
            <br />
            <br />
            <ThemeContext.Provider value={{
                theme,
                toggle: () => {
                    setTheme(theme => {
                        setTheme(theme === themes.light ? themes.dark : themes.light)
                    })
                }
            }}>
                <Toolbar />
            </ThemeContext.Provider>
        </div>
    )
}
const themes = {
    light: { background: '#eeeeee' },
    dark: { background: '#222222' }
}
const ThemeContext = React.createContext({
    theme: themes.light,
    toggle: () => { }
})

const Toolbar = () => {
    return <ThemeButton />
}
const ThemeButton = () => {
    const context = useContext(ThemeContext)
    return <button
        style={{ background: context.theme.background }}
        onClick={() => { context.toggle()}}
    >click me</button>
}


