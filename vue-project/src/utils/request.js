import axios from 'axios'

const request = axios.create({
    baseURL:'http://101.37.18.198:8080',
})
export default request