
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import HelloManager from "./components/listers/HelloCards"
import HelloDetail from "./components/listers/HelloDetail"

import WordManager from "./components/listers/WordCards"
import WordDetail from "./components/listers/WordDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/hellos',
                name: 'HelloManager',
                component: HelloManager
            },
            {
                path: '/hellos/:id',
                name: 'HelloDetail',
                component: HelloDetail
            },

            {
                path: '/words',
                name: 'WordManager',
                component: WordManager
            },
            {
                path: '/words/:id',
                name: 'WordDetail',
                component: WordDetail
            },



    ]
})
