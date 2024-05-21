<template>
  <div>
    <h1>{{ msg }}</h1>
  </div>

</template>

<script>
import { inject } from 'vue'

export default {
  created: function(){
    console.log("hello组件创建");

    const proxy = inject('$http');


    proxy.get('/hello?name=jack')
      .then((response)=>{
      console.log(response)
      this.msg = response.data
    }) 
  },

  data() {
    return {
      msg: "default"
    }
  }
}
</script>