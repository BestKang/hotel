!function(t,e){if("object"==typeof exports&&"object"==typeof module)module.exports=e();else if("function"==typeof define&&define.amd)define([],e);else{var n=e();for(var r in n)("object"==typeof exports?exports:t)[r]=n[r]}}(this,function(){return function(t){function e(r){if(n[r])return n[r].exports;var o=n[r]={i:r,l:!1,exports:{}};return t[r].call(o.exports,o,o.exports,e),o.l=!0,o.exports}var n={};return e.m=t,e.c=n,e.d=function(t,n,r){e.o(t,n)||Object.defineProperty(t,n,{configurable:!1,enumerable:!0,get:r})},e.n=function(t){var n=t&&t.__esModule?function(){return t.default}:function(){return t};return e.d(n,"a",n),n},e.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},e.p="",e(e.s=8)}([function(t,e,n){"use strict";function r(t,e,n,r){var o=t[e];t[e]=n(o),r&&r.push([t,e,o])}function o(t){for(var e=[].slice.call(t.attributes).filter(function(t){return b.test(t.name)}).map(function(t){return[t.name.substr(5).replace(/-(.)/g,function(t,e){return e.toUpperCase()}),t.value]}),n={},r=0,o=e;r<o.length;r++){var i=o[r],a=i[0],s=i[1];n[a]=s}return{tag:t.tagName,class:""!==t.className?t.className.split(" ").filter(Boolean):null,id:t.id||null,data:n}}function i(t){for(var e,n=[],r=" > ".length,o=0,i=0;t&&o++<S&&!("html"===(e=a(t))||o>1&&i+n.length*r+e.length>=k);)n.push(e),i+=e.length,t=t.parentNode;return n.reverse().join(" > ")}function a(t){var e,n,r,o,i,a=[];if(!t||!t.tagName)return"";if(a.push(t.tagName.toLowerCase()),t.id&&a.push("#"+t.id),(e=t.className)&&"string"==typeof e)for(n=e.split(/\s+/),i=0;i<n.length;i++)a.push("."+n[i]);var s=["type","name","title","alt"];for(i=0;i<s.length;i++)r=s[i],(o=t.getAttribute(r))&&a.push("["+r+'="'+o+'"]');return a.join("")}function s(t,e){return O.hasOwnProperty.call(t,e)}function u(t,e){var n={};for(var r in t)n[r]=t[r];for(var r in e)n[r]=e[r];return n}function c(t){return"string"==typeof t}function l(t){return null===t}function f(t){return void 0===t}function p(t){return"object"==typeof t}function d(t){return t instanceof Error}function h(t){return l(t)||f(t)}function g(t){return"function"==typeof t&&t.call&&t.apply}function m(t){return t instanceof Array&&t.push&&t.pop&&t.length}function v(t){return x.hasJSON?JSON.parse(JSON.stringify(t)):t}function y(t){var e=new Date(t-288e5),n=_(e,!0,"-").replace(" ","T");return n+="Z"}function _(t,e,n){var r=t.getFullYear()+n;return t.getMonth()+1<10?r+="0"+(t.getMonth()+1)+n:r=r+(t.getMonth()+1)+n,t.getDate()<10?r+="0"+t.getDate():r+=t.getDate(),e?(r+=" ",t.getHours()<10?r+="0"+t.getHours()+":":r+=t.getHours()+":",t.getMinutes()<10?r+="0"+t.getMinutes()+":":r+=t.getMinutes()+":",t.getSeconds()<10?r+="0"+t.getSeconds():r+=t.getSeconds(),r):r}function w(t){if(-1===t.indexOf("://")&&(t=document.location.protocol+"//"+window.location.host+t),!t||0===t.length)return{domain:"",path:""};var e=new URL(t);return{domain:e.host,path:e.pathname}}Object.defineProperty(e,"__esModule",{value:!0});var x=n(2);e.fill=r;var b=/^data-/;e.serializeDOMElement=o;var S=5,k=80;e.htmlTreeAsString=i,e.htmlElementAsString=a;var O=Object.prototype;e.hasKey=s,e.merge=u,e.isString=c,e.isNull=l,e.isUndefined=f,e.isObject=p,e.isError=d,e.isNil=h,e.isFunction=g,e.isArray=m,e.clone=v,e.timestampToUTCStr=y,e.convertDateToDateStr=_,e.getDominFromUrl=w},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=n(0),o=function(){return{type:"message",category:"message",payload:{},timestamp:Date.now()}},i=function(){function t(t,e){this.receivers=[],this.name=t,this.processor=e,e(this.action.bind(this))}return t.prototype.action=function(t){var e=r.merge(o(),t);this.receivers.forEach(function(t){return t(e)})},t.prototype.onAction=function(t){this.receivers.push(t)},t.prototype.dispose=function(){this.receivers.forEach(function(t){return null}),this.receivers=[]},t}();e.default=i},function(t,e,n){"use strict";(function(t){Object.defineProperty(e,"__esModule",{value:!0});var r=n(0);e._window=r.isUndefined(window)?r.isUndefined(t)?r.isUndefined(self)?{}:self:t:window,e._document=e._window.document,e._navigator=e._window.navigator,e.hasJSON=!(!r.isObject(JSON)||r.isNil(JSON.stringify)),e.hasDocument=!r.isUndefined(e._document),e.hasNavigator=!r.isUndefined(e._navigator)}).call(e,n(5))},function(t,e,n){"use strict";var r=this&&this.__extends||function(){var t=Object.setPrototypeOf||{__proto__:[]}instanceof Array&&function(t,e){t.__proto__=e}||function(t,e){for(var n in e)e.hasOwnProperty(n)&&(t[n]=e[n])};return function(e,n){function r(){this.constructor=e}t(e,n),e.prototype=null===n?Object.create(n):(r.prototype=n.prototype,new r)}}();Object.defineProperty(e,"__esModule",{value:!0});var o=JSON.stringify,i=function(){function t(){this.data={}}return t.prototype.setItem=function(t,e){this.data[t]=e},t.prototype.getItem=function(t){return this.data[t]},t.prototype.removeItem=function(t){delete this.data[t]},t.prototype.clear=function(){this.data={}},t}();e.Storage=i;var a=null,s=function(){function t(e){this.type=t,this._storage=new i,this.keys=[],this.name=e}return t.bindRealStorage=function(t){a=t},Object.defineProperty(t.prototype,"storage",{get:function(){return a||this._storage},enumerable:!0,configurable:!0}),t.prototype.set=function(t,e){return this.storage.setItem(this.name+":"+t,o(e)),-1===this.keys.indexOf(t)&&this.keys.push(t),e},t.prototype.get=function(t){var e=this.storage.getItem(this.name+":"+t);return e?JSON.parse(e):null},t.prototype.has=function(t){return this.keys.indexOf(t)>=0},t.prototype.remove=function(t){this.storage.removeItem(this.name+":"+t);var e=this.keys.indexOf(t);e>=0&&this.keys.splice(e,1)},t.prototype.clear=function(){this.storage.clear(),this.keys=[]},t.prototype.merge=function(t){for(var e in t)if(t.hasOwnProperty(e)){var n=t[e];this.set(e,n)}},t.prototype.toJS=function(){for(var t={},e=0,n=this.keys;e<n.length;e++){var r=n[e];t[r]=this.get(r)}return t},t}();e.Store=s;var u=function(t){function e(){var n=null!==t&&t.apply(this,arguments)||this;return n.type=e,n}return r(e,t),Object.defineProperty(e.prototype,"length",{get:function(){return this.collect().length},enumerable:!0,configurable:!0}),e.prototype.collect=function(){return this.get("collection")||[]},e.prototype.push=function(t){var e=this.collect();return e.push(t),this._update(e),e.length},e.prototype.pop=function(){var t=this.collect(),e=t.pop();return this._update(t),e},e.prototype.shift=function(){var t=this.collect(),e=t.shift();return this._update(t),e},e.prototype.unshift=function(t){var e=this.collect();return e.unshift(t),this._update(e),e.length},e.prototype._update=function(t){this.set("collection",t),this.set("length",t.length)},e}(s);e.CollectionStore=u},function(t,e,n){(function(n){var r,o,i;!function(n,a){function s(t,e){return Object.prototype.hasOwnProperty.call(t,e)}function u(t){return void 0===t}if(n){var c={},l=n.TraceKit,f=[].slice,p="?",d=/^(?:[Uu]ncaught (?:exception: )?)?(?:((?:Eval|Internal|Range|Reference|Syntax|Type|URI|)Error): )?(.*)$/;c.noConflict=function(){return n.TraceKit=l,c},c.wrap=function(t){function e(){try{return t.apply(this,arguments)}catch(t){throw c.report(t),t}}return e},c.report=function(){function t(t){i(),p.push(t)}function e(t){for(var e=p.length-1;e>=0;--e)p[e]===t&&p.splice(e,1);0===p.length&&(n.onerror=l,f=!1)}function r(t,e,n){var r=null;if(!e||c.collectWindowErrors){for(var o in p)if(s(p,o))try{p[o](t,e,n)}catch(t){r=t}if(r)throw r}}function o(t,e,n,o,i){var s=null;if(g)c.computeStackTrace.augmentStackTraceWithInitialElement(g,e,n,t),a();else if(i)s=c.computeStackTrace(i),r(s,!0,i);else{var u,f={url:e,line:n,column:o},p=t;if("[object String]"==={}.toString.call(t)){var h=t.match(d);h&&(u=h[1],p=h[2])}f.func=c.computeStackTrace.guessFunctionName(f.url,f.line),f.context=c.computeStackTrace.gatherContext(f.url,f.line),s={name:u,message:p,mode:"onerror",stack:[f]},r(s,!0,null)}return!!l&&l.apply(this,arguments)}function i(){!0!==f&&(l=n.onerror,n.onerror=o,f=!0)}function a(){var t=g,e=h;g=null,h=null,r(t,!1,e)}function u(t){if(g){if(h===t)return;a()}var e=c.computeStackTrace(t);throw g=e,h=t,setTimeout(function(){h===t&&a()},e.incomplete?2e3:0),t}var l,f,p=[],h=null,g=null;return u.subscribe=t,u.unsubscribe=e,u}(),c.computeStackTrace=function(){function t(t){if(!c.remoteFetching)return"";try{var e=function(){try{return new n.XMLHttpRequest}catch(t){return new n.ActiveXObject("Microsoft.XMLHTTP")}}();return e.open("GET",t,!1),e.send(""),e.responseText}catch(t){return""}}function e(e){if("string"!=typeof e)return[];if(!s(b,e)){var r="",o="";try{o=n.document.domain}catch(t){}var i=/(.*)\:\/\/([^:\/]+)([:\d]*)\/{0,1}([\s\S]*)/.exec(e);i&&i[2]===o&&(r=t(e)),b[e]=r?r.split("\n"):[]}return b[e]}function r(t,n){var r,o=/function ([^(]*)\(([^)]*)\)/,i=/['"]?([0-9A-Za-z$_]+)['"]?\s*[:=]\s*(function|eval|new Function)/,a="",s=e(t);if(!s.length)return p;for(var c=0;c<10;++c)if(a=s[n-c]+a,!u(a)){if(r=i.exec(a))return r[1];if(r=o.exec(a))return r[1]}return p}function o(t,n){var r=e(t);if(!r.length)return null;var o=[],i=Math.floor(c.linesOfContext/2),a=i+c.linesOfContext%2,s=Math.max(0,n-i-1),l=Math.min(r.length,n+a-1);n-=1;for(var f=s;f<l;++f)u(r[f])||o.push(r[f]);return o.length>0?o:null}function i(t){return t.replace(/[\-\[\]{}()*+?.,\\\^$|#]/g,"\\$&")}function a(t){return i(t).replace("<","(?:<|&lt;)").replace(">","(?:>|&gt;)").replace("&","(?:&|&amp;)").replace('"','(?:"|&quot;)').replace(/\s+/g,"\\s+")}function l(t,n){for(var r,o,i=0,a=n.length;i<a;++i)if((r=e(n[i])).length&&(r=r.join("\n"),o=t.exec(r)))return{url:n[i],line:r.substring(0,o.index).split("\n").length,column:o.index-r.lastIndexOf("\n",o.index)-1};return null}function f(t,n,r){var o,a=e(n),s=new RegExp("\\b"+i(t)+"\\b");return r-=1,a&&a.length>r&&(o=s.exec(a[r]))?o.index:null}function d(t){if(!u(n&&n.document)){for(var e,r,o,s,c=[n.location.href],f=n.document.getElementsByTagName("script"),p=""+t,d=/^function(?:\s+([\w$]+))?\s*\(([\w\s,]*)\)\s*\{\s*(\S[\s\S]*\S)\s*\}\s*$/,h=/^function on([\w$]+)\s*\(event\)\s*\{\s*(\S[\s\S]*\S)\s*\}\s*$/,g=0;g<f.length;++g){var m=f[g];m.src&&c.push(m.src)}if(o=d.exec(p)){var v=o[1]?"\\s+"+o[1]:"",y=o[2].split(",").join("\\s*,\\s*");e=i(o[3]).replace(/;$/,";?"),r=new RegExp("function"+v+"\\s*\\(\\s*"+y+"\\s*\\)\\s*{\\s*"+e+"\\s*}")}else r=new RegExp(i(p).replace(/\s+/g,"\\s+"));if(s=l(r,c))return s;if(o=h.exec(p)){var _=o[1];if(e=a(o[2]),r=new RegExp("on"+_+"=[\\'\"]\\s*"+e+"\\s*[\\'\"]","i"),s=l(r,c[0]))return s;if(r=new RegExp(e),s=l(r,c))return s}return null}}function h(t){if(!t.stack)return null;for(var e,n,i,a,s=/^\s*at (.*?) ?\(((?:file|https?|blob|chrome-extension|native|eval|webpack|<anonymous>|\/).*?)(?::(\d+))?(?::(\d+))?\)?\s*$/i,c=/^\s*(.*?)(?:\((.*?)\))?(?:^|@)((?:file|https?|blob|chrome|webpack|resource|\[native).*?|[^@]*bundle)(?::(\d+))?(?::(\d+))?\s*$/i,l=/^\s*at (?:((?:\[object object\])?.+) )?\(?((?:file|ms-appx|https?|webpack|blob):.*?):(\d+)(?::(\d+))?\)?\s*$/i,d=/(\S+) line (\d+)(?: > eval line \d+)* > eval/i,h=/\((\S*)(?::(\d+))(?::(\d+))\)/,g=t.stack.split("\n"),m=[],v=/^(.*) is undefined$/.exec(t.message),y=0,_=g.length;y<_;++y){if(i=s.exec(g[y])){var w=i[2]&&0===i[2].indexOf("native");e=i[2]&&0===i[2].indexOf("eval"),e&&(n=h.exec(i[2]))&&(i[2]=n[1],i[3]=n[2],i[4]=n[3]),a={url:w?null:i[2],func:i[1]||p,args:w?[i[2]]:[],line:i[3]?+i[3]:null,column:i[4]?+i[4]:null}}else if(i=l.exec(g[y]))a={url:i[2],func:i[1]||p,args:[],line:+i[3],column:i[4]?+i[4]:null};else{if(!(i=c.exec(g[y])))continue;e=i[3]&&i[3].indexOf(" > eval")>-1,e&&(n=d.exec(i[3]))?(i[3]=n[1],i[4]=n[2],i[5]=null):0!==y||i[5]||u(t.columnNumber)||(m[0].column=t.columnNumber+1),a={url:i[3],func:i[1]||p,args:i[2]?i[2].split(","):[],line:i[4]?+i[4]:null,column:i[5]?+i[5]:null}}!a.func&&a.line&&(a.func=r(a.url,a.line)),a.context=a.line?o(a.url,a.line):null,m.push(a)}return m.length?(m[0]&&m[0].line&&!m[0].column&&v&&(m[0].column=f(v[1],m[0].url,m[0].line)),{mode:"stack",name:t.name,message:t.message,stack:m}):null}function g(t){var e=t.stacktrace;if(e){for(var n,i=/ line (\d+).*script (?:in )?(\S+)(?:: in function (\S+))?$/i,a=/ line (\d+), column (\d+)\s*(?:in (?:<anonymous function: ([^>]+)>|([^\)]+))\((.*)\))? in (.*):\s*$/i,s=e.split("\n"),u=[],c=0;c<s.length;c+=2){var l=null;if((n=i.exec(s[c]))?l={url:n[2],line:+n[1],column:null,func:n[3],args:[]}:(n=a.exec(s[c]))&&(l={url:n[6],line:+n[1],column:+n[2],func:n[3]||n[4],args:n[5]?n[5].split(","):[]}),l){if(!l.func&&l.line&&(l.func=r(l.url,l.line)),l.line)try{l.context=o(l.url,l.line)}catch(t){}l.context||(l.context=[s[c+1]]),u.push(l)}}return u.length?{mode:"stacktrace",name:t.name,message:t.message,stack:u}:null}}function m(t){var i=t.message.split("\n");if(i.length<4)return null;var u,c=/^\s*Line (\d+) of linked script ((?:file|https?|blob)\S+)(?:: in function (\S+))?\s*$/i,f=/^\s*Line (\d+) of inline#(\d+) script in ((?:file|https?|blob)\S+)(?:: in function (\S+))?\s*$/i,p=/^\s*Line (\d+) of function script\s*$/i,d=[],h=n&&n.document&&n.document.getElementsByTagName("script"),g=[];for(var m in h)s(h,m)&&!h[m].src&&g.push(h[m]);for(var v=2;v<i.length;v+=2){var y=null;if(u=c.exec(i[v]))y={url:u[2],func:u[3],args:[],line:+u[1],column:null};else if(u=f.exec(i[v])){y={url:u[3],func:u[4],args:[],line:+u[1],column:null};var _=+u[1],w=g[u[2]-1];if(w){var x=e(y.url);if(x){x=x.join("\n");var b=x.indexOf(w.innerText);b>=0&&(y.line=_+x.substring(0,b).split("\n").length)}}}else if(u=p.exec(i[v])){var S=n.location.href.replace(/#.*$/,""),k=new RegExp(a(i[v+1])),O=l(k,[S]);y={url:S,func:"",args:[],line:O?O.line:u[1],column:null}}if(y){y.func||(y.func=r(y.url,y.line));var T=o(y.url,y.line),E=T?T[Math.floor(T.length/2)]:null;T&&E.replace(/^\s*/,"")===i[v+1].replace(/^\s*/,"")?y.context=T:y.context=[i[v+1]],d.push(y)}}return d.length?{mode:"multiline",name:t.name,message:i[0],stack:d}:null}function v(t,e,n,i){var a={url:e,line:n};if(a.url&&a.line){t.incomplete=!1,a.func||(a.func=r(a.url,a.line)),a.context||(a.context=o(a.url,a.line));var s=/ '([^']+)' /.exec(i);if(s&&(a.column=f(s[1],a.url,a.line)),t.stack.length>0&&t.stack[0].url===a.url){if(t.stack[0].line===a.line)return!1;if(!t.stack[0].line&&t.stack[0].func===a.func)return t.stack[0].line=a.line,t.stack[0].context=a.context,!1}return t.stack.unshift(a),t.partial=!0,!0}return t.incomplete=!0,!1}function y(t,e){for(var n,o,i,a=/function\s+([_$a-zA-Z\xA0-\uFFFF][_$a-zA-Z0-9\xA0-\uFFFF]*)?\s*\(/i,s=[],u={},l=!1,h=y.caller;h&&!l;h=h.caller)if(h!==_&&h!==c.report){if(o={url:null,func:p,args:[],line:null,column:null},h.name?o.func=h.name:(n=a.exec(h.toString()))&&(o.func=n[1]),void 0===o.func)try{o.func=n.input.substring(0,n.input.indexOf("{"))}catch(t){}if(i=d(h)){o.url=i.url,o.line=i.line,o.func===p&&(o.func=r(o.url,o.line));var g=/ '([^']+)' /.exec(t.message||t.description);g&&(o.column=f(g[1],i.url,i.line))}u[""+h]?l=!0:u[""+h]=!0,s.push(o)}e&&s.splice(0,e);var m={mode:"callers",name:t.name,message:t.message,stack:s};return v(m,t.sourceURL||t.fileName,t.line||t.lineNumber,t.message||t.description),m}function _(t,e){var n=null;e=null==e?0:+e;try{if(n=g(t))return n}catch(t){if(x)throw t}try{if(n=h(t))return n}catch(t){if(x)throw t}try{if(n=m(t))return n}catch(t){if(x)throw t}try{if(n=y(t,e+1))return n}catch(t){if(x)throw t}return{name:t.name,message:t.message,mode:"failed"}}function w(t){t=1+(null==t?0:+t);try{throw new Error}catch(e){return _(e,t+1)}}var x=!1,b={};return _.augmentStackTraceWithInitialElement=v,_.computeStackTraceFromStackProp=h,_.guessFunctionName=r,_.gatherContext=o,_.ofCaller=w,_.getSource=e,_}(),c.extendToAsynchronousCallbacks=function(){var t=function(t){var e=n[t];n[t]=function(){var t=f.call(arguments),n=t[0];return"function"==typeof n&&(t[0]=c.wrap(n)),e.apply?e.apply(this,t):e(t[0],t[1])}};t("setTimeout"),t("setInterval")},c.remoteFetching||(c.remoteFetching=!0),c.collectWindowErrors||(c.collectWindowErrors=!0),(!c.linesOfContext||c.linesOfContext<1)&&(c.linesOfContext=11),o=[],r=c,void 0!==(i="function"==typeof r?r.apply(e,o):r)&&(t.exports=i)}}("undefined"!=typeof window?window:n)}).call(e,n(5))},function(t,e){var n;n=function(){return this}();try{n=n||Function("return this")()||(0,eval)("this")}catch(t){"object"==typeof window&&(n=window)}t.exports=n},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=["log","info","warn","error"],o={};r.forEach(function(t){return o[t]=console[t]});var i={qiniu:"#29a8e1",normal:"#333",log:"#86C166",info:"#006284",warn:"#CA7A2C",error:"#CB1B45"},a={};r.forEach(function(t){return a[t]=function(e){for(var n=[],r=1;r<arguments.length;r++)n[r-1]=arguments[r];return"string"!=typeof e||n.length>0?o[t].apply(console,[e].concat(n)):o[t].call(console,"%c[DEM-DEBUG] %c["+t.toUpperCase()+"] %c"+e,"color: "+i.qiniu,"color: "+i[t],"color: "+i.normal)}}),e.default=a},function(t,e,n){"use strict";function r(t){return t}Object.defineProperty(e,"__esModule",{value:!0});var o=n(3),i=function(){function t(t,e){void 0===e&&(e=r),this.queue=[],this.running=!1,this.name=t,this.configStore=new o.Store("transfer:"+t),this.transfer=e}return t.prototype.config=function(t,e){if("string"==typeof t){var n=t;this.configStore.set(n,e)}else for(var n in t)if(t.hasOwnProperty(n)){var r=t[n];this.config(n,r)}},t.prototype.send=function(t){var e=this,n=t.data;t.sent;this.queue.push(function(){return new Promise(function(r,o){e.transfer.call(e,e.extendMessage(n)).then(function(){t.sent=!0}).then(r).catch(o)})}),this.running||this.run()},t.prototype.sendArray=function(t){var e=this,n=[];t.map(function(t){n.push(t.data)}),this.queue.push(function(){return new Promise(function(r,o){e.transfer.call(e,e.extendMessages(n)).then(function(){t.map(function(t){t.sent=!0})}).then(r).catch(o)})}),this.running||this.run()},t.prototype.extendMessages=function(t){var e=this;return t.map(function(t){e.configStore.has("user")&&(t.user=e.configStore.get("user")),e.configStore.has("tags")&&(t.tags=e.configStore.get("tags")),e.configStore.has("extra")&&(t.extra=e.configStore.get("extra")),e.configStore.has("release")&&(t.release=e.configStore.get("release")),e.configStore.has("environment")&&(t.environment=e.configStore.get("environment"))}),t},t.prototype.extendMessage=function(t){return this.configStore.has("user")&&(t.user=this.configStore.get("user")),this.configStore.has("tags")&&(t.tags=this.configStore.get("tags")),this.configStore.has("extra")&&(t.extra=this.configStore.get("extra")),this.configStore.has("release")&&(t.release=this.configStore.get("release")),this.configStore.has("environment")&&(t.environment=this.configStore.get("environment")),t},t.prototype.run=function(){var t=this,e=this.queue.splice(0,1)[0];e?(this.running=!0,e().then(function(){return t.run()})):this.running=!1},t}();e.default=i},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=n(9),o=n(7),i=n(17);!function(t){function e(){this.setTag=function(t){c.setTag(t)},this.sendCustomEventData=function(t,e){return c.sendCustomEventData(t,e)}}t.predem=new e}(window);var a=24,s=8,u=function(){function t(){var t=document.currentScript.getAttribute("data-app-key");if(t.length!=a)return void console.error("appKey error");var e=document.currentScript.getAttribute("data-domain");if(0==e.length)return void console.error("domain can not be null");var n=document.currentScript.getAttribute("data-tag"),r=t.substring(0,s);i.default.init(r,e),i.default.setTag(n),this.initTransfer()}return t.prototype.setTag=function(t){i.default.setTag(t)},t.prototype.sendCustomEventData=function(t,e){return i.default.sendEventData(t,JSON.stringify(e))},t.prototype.initTransfer=function(){var t=new o.default(i.default.tag,function(t){return i.default.push(t)});r.default.addTransfer(t)},t}(),c=new u;t.exports=c},function(t,e,n){"use strict";function r(t,e){return v.isFunction(e)?function(n){return e(n,t)}:e}Object.defineProperty(e,"__esModule",{value:!0});var o=n(4),i=n(2),a=n(3),s=n(10),u=n(7),c=n(1),l=n(11),f=n(12),p=n(13),d=n(14),h=n(15),g=n(16),m=n(6),v=n(0),y={environment:"production",autoInstall:!0,instrument:{tryCatch:!0},autoBreadcrumbs:{xhr:!0,console:!1,dom:!1,history:!1,performance:!0}},_=function(){function t(t){if(void 0===t&&(t={}),this.callbacks={},this.configStore=new a.Store("config"),this.contextStore=new a.Store("context"),this.messages=new s.MessagesStore(this),this.transfers=[],this.sources=[],this.__wrappedBuiltins=[],this._ignoreOnError=0,this.option=v.merge(v.clone(y),t),this.option.debug&&(this.debug=!0),this.option.release&&this.setRelease(this.option.release),this.option.environment&&this.setEnvironment(this.option.environment),this.option.transfer&&this.addTransfer(this.option.transfer),this.option.transfers)for(var e=0,n=this.option.transfers;e<n.length;e++){var r=n[e];this.addTransfer(r)}if(this.option.sources)for(var o=0,i=this.option.sources;o<i.length;o++){var u=i[o];this.addSource(u)}this.option.autoInstall&&this.install()}return Object.defineProperty(t.prototype,"Transfer",{get:function(){return u.default},enumerable:!0,configurable:!0}),Object.defineProperty(t.prototype,"Source",{get:function(){return c.default},enumerable:!0,configurable:!0}),Object.defineProperty(t.prototype,"logger",{get:function(){return m.default},enumerable:!0,configurable:!0}),Object.defineProperty(t.prototype,"debug",{get:function(){return this.configStore.get("debug")||!1},set:function(t){!0===t&&m.default.info("[CONFIG] set debug = "+t),this.configStore.set("debug",t)},enumerable:!0,configurable:!0}),t.prototype.install=function(){return this.option.instrument&&this.option.instrument.tryCatch&&this.addSource(h.default()),this.option.autoBreadcrumbs&&this._setupBreadcrumb(),this},t.prototype.uninstall=function(){return this._restoreBuiltIns(),this.sources.forEach(function(t){return t.dispose()}),this},t.prototype.addSource=function(t){var e=this;if(t)return t.onAction(function(t){return e.messages.add(t)}),this.sources.push(t),this.debug&&this.logger.info("[SOURCE] added source "+t.name),this},t.prototype.addTransfer=function(t){return t.config(this.configStore.toJS()),this.transfers.push(t),this.debug&&this.logger.info("[TRANSFER] added transfer "+t.name),this},t.prototype.config=function(t,e){if("string"==typeof t){var n=t;this.configStore.set(n,e),this.debug&&this.logger.info("[CONFIG] set "+n+" = "+e)}else for(var n in t)if(t.hasOwnProperty(n)){var r=t[n];this.config(n,r)}return this},t.prototype.captureException=function(t,e){if(void 0===e&&(e={}),!v.isError(t))return this.captureException(t,v.merge({trimHeadFrames:1,stacktrace:!0},e));try{o.report(t)}catch(e){if(t!==e)throw e}return this.debug&&this.logger.error("[EXCEPTION] capture exception: "+t.message),this},t.prototype.setUserContext=function(t){var e=this;return this.contextStore.set("user",t),this.transfers.length>0&&this.transfers.forEach(function(t){return t.config(e.contextStore.toJS())}),this.debug&&this.logger.info("[CONTEXT] set user context: "+t),this},t.prototype.setTagsContext=function(t){var e=this;return this.contextStore.set("tags",t),this.transfers.length>0&&this.transfers.forEach(function(t){return t.config(e.contextStore.toJS())}),this.debug&&this.logger.info("[CONTEXT] set tags context: "+t),this},t.prototype.setExtraContext=function(t){var e=this;return this.contextStore.set("extra",t),this.transfers.length>0&&this.transfers.forEach(function(t){return t.config(e.contextStore.toJS())}),this.debug&&this.logger.info("[CONTEXT] set extra context: "+t),this},t.prototype.clearContext=function(){return this.contextStore.clear(),this.debug&&this.logger.info("[CONTEXT] clear context"),this},t.prototype.getContext=function(){return this.contextStore.toJS()},t.prototype.setEnvironment=function(t){return this.contextStore.set("environment",t),this.debug&&this.logger.info("[CONTEXT] set environment context: "+t),this},t.prototype.setRelease=function(t){return this.contextStore.set("release",t),this.debug&&this.logger.info("[CONTEXT] set release context: "+t),this},t.prototype.getCallback=function(t){return v.isNil(this.callbacks[t])?function(){return!1}:this.callbacks[t]},t.prototype.setCallback=function(t,e){v.isUndefined(e)?(this.callbacks[t]=null,this.debug&&m.default.info("[CALLBACK] remove "+t+" callback")):v.isFunction(e)&&(this.callbacks[t]=e,this.debug&&m.default.info("[CALLBACK] set "+t+" callback"))},t.prototype.setBreadcrumbCallback=function(t){var e=this.getCallback("breadcrumb");this.setCallback("breadcrumb",r(e,t))},t.prototype.setExceptionCallback=function(t){var e=this.getCallback("exception");this.setCallback("exception",r(e,t))},t.prototype.wrap=function(t,e,n){function r(){var r=[],i=arguments.length,a=!t||t&&!1!==t.deep;for(n&&v.isFunction(n)&&n.apply(this,arguments);i--;)r[i]=a?o.wrap(t,arguments[i]):arguments[i];try{return e.apply(this,r)}catch(e){throw o._ignoreNextOnError(),o.captureException(e,t),e}}if(v.isUndefined(e)&&!v.isFunction(t))return t;if(v.isFunction(t)&&(e=t,t=void 0),!v.isFunction(e))return e;try{if(e.__dem__)return e;if(e.__dem_wrapper__)return e.__dem_wrapper__}catch(t){return e}var o=this;for(var i in e)v.hasKey(e,i)&&(r[i]=e[i]);if(r.prototype=e.prototype,e.__dem_wrapper__=r,r.__dem__=!0,r.__inner__=e,this.debug){var a=e.name||"anynomous";m.default.info("wrap function "+a)}return r},t.prototype.context=function(t,e,n){var r=null;switch(!0){case v.isArray(e)&&v.isUndefined(n):r=e;break;case!v.isArray(e)&&v.isUndefined(n):r=[],e;break;case v.isArray(e)&&!v.isUndefined(n):r=e,n}return this.wrap(n,t).apply(this,r)},t.prototype._ignoreNextOnError=function(){var t=this;this._ignoreOnError+=1,setTimeout(function(){t._ignoreOnError-=1})},t.prototype._setupBreadcrumb=function(){(this.option.autoBreadcrumbs.xhr||!0===this.option.autoBreadcrumbs)&&this.addSource(l.default(this)),(this.option.autoBreadcrumbs.history||!0===this.option.autoBreadcrumbs)&&this.addSource(p.default(this)),(this.option.autoBreadcrumbs.dom||!0===this.option.autoBreadcrumbs)&&this.addSource(d.default()),(this.option.autoBreadcrumbs.console||!0===this.option.autoBreadcrumbs)&&this.addSource(f.default()),(this.option.autoBreadcrumbs.performance||!0===this.option.autoBreadcrumbs)&&this.addSource(g.default())},t.prototype._restoreBuiltIns=function(){for(var t=0,e=this.__wrappedBuiltins;t<e.length;t++){var n=e[t],r=n[0],o=n[1],i=n[2];r[o]=i}},t}();e.Dem=_;var w=new _(i._window.dem_option||{});e.default=w},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=n(3),o=n(6),i=["console","history","ui.events","network"],a=function(t){return i.indexOf(t)>=0},s=function(){function t(t){this.counter=0,this.store=new r.CollectionStore("messages"),this.messageArray=[],this.performanceArray=[],this.messageThreshold=2,this.maxTime=108e5,this.parent=t}return t.prototype.add=function(t){var e=this,n={id:++this.counter,data:t,sent:!1};if("network"!==n.data.category)this.store.push(n),this.parent.transfers.forEach(function(t){return t.send(n)});else{this.messageArray.push(n);var r=(new Date).getTime()-this.messageArray[0].timestamp;(this.messageArray.length>=this.messageThreshold||r>this.maxTime)&&(this.messageArray.map(function(t){e.store.push(t)}),this.parent.transfers.forEach(function(t){return t.sendArray(e.messageArray)}),this.messageArray=[])}a(t.category)&&this.parent.getCallback("breadcrumb")(t),"error"===t.category&&this.parent.getCallback("exception")(t),this.parent.debug&&(o.default.log("[MESSAGES] New message added ["+t.category+"], messages count: "+this.store.length),o.default.log("[MESSAGES]",t))},t}();e.MessagesStore=s},function(t,e,n){"use strict";function r(t,e,n,r){return void 0===r&&(r=null),{action:t,method:e,url:n,status_code:r,duration:0}}Object.defineProperty(e,"__esModule",{value:!0});var o=n(1),i=n(0),a=n(2);e.default=function(t){function e(e,n){e in n&&i.isFunction(n[e])&&i.fill(n,e,function(e){return t.wrap(e)})}return a._window?new o.default("breadcrumb.XHR",function(n){if("XMLHttpRequest"in a._window){var o=XMLHttpRequest.prototype;i.fill(o,"open",function(t){return function(e,n){return this.__dem_xhr=r("open",e,n),t.apply(this,arguments)}},t.__wrappedBuiltins),i.fill(o,"send",function(r){return function(o){function a(){if(s.__dem_xhr&&2===s.readyState&&(s.__dem_xhr.responseTimestamp=Date.now()),s.__dem_xhr&&(1===s.readyState||4===s.readyState)){c&&clearTimeout(c);try{s.__dem_xhr.status_code=s.status,s.__dem_xhr.duration=Date.now()-u,s.__dem_xhr.responseText=s.responseText,s.__dem_xhr.contentLength=s.getResponseHeader("Content-Length")}catch(t){}n({category:"network",payload:s.__dem_xhr})}}for(var s=this,u=Date.now(),c=setTimeout(function(){return n({category:"network",payload:s.__dem_xhr})},3e4),l=["onload","onerror","onprogress"],f=0,p=l;f<p.length;f++){e(p[f],s)}return"onreadystatechange"in s&&i.isFunction(s.onreadystatechange)?i.fill(s,"onreadystatechange",function(e){return t.wrap(e,void 0,a)}):s.onreadystatechange=a,r.apply(this,arguments)}},t.__wrappedBuiltins)}"fetch"in a._window&&(a._window._origin_fetch=a._window.fetch,i.fill(a._window,"fetch",function(t){return function(){for(var e=[],r=0;r<arguments.length;r++)e[r]=arguments[r];var o=e[0],i="GET",s=null;"string"==typeof o?s=o:(s=o.url,o.method&&(i=o.method)),e[1]&&e[1].method&&(i=e[1].method);var u={method:i,url:s,status_code:null,duration:0,responseTimestamp:0},c=Date.now(),l=setTimeout(function(){return n({category:"network",payload:u})},3e4);return t.apply(a._window,e).then(function(t){return l&&clearTimeout(l),u.status_code=t.status,u.responseTimestamp=Date.now(),u.duration=Date.now()-c,n({category:"network",payload:u}),t})}},t.__wrappedBuiltins))}):null}},function(t,e,n){"use strict";function r(t,e,n){var r=t[e],o=t;e in t&&(t["_origin_"+e]=r,t[e]=function(){for(var t=[],i=0;i<arguments.length;i++)t[i]=arguments[i];var a=t.join(" "),s={level:e,logger:"console",extra:{arguments:t}};r&&Function.prototype.apply.call(r,o,t),n(a,s)})}Object.defineProperty(e,"__esModule",{value:!0});var o=n(1);e.wrapMethod=r;var i=["debug","info","warn","error","log"];e.default=function(){return new o.default("breadcrumb.console",function(t){for(var e=function(e,n){t({category:"console",payload:{level:n.level,message:e}})},n=0,o=i;n<o.length;n++){var a=o[n];r(console,a,e)}})}},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=n(1),o=n(0),i=n(2);e.default=function(t){if(i._window){var e=i._window.location,n=e&&e.href,a=i._window.chrome;if(!(a&&a.app&&a.app.runtime)&&i._window.history&&history.pushState)return new r.default("breadcrumb.history",function(r){if(i._window&&i._navigator&&i._document){var a={category:"navigation",payload:{to:n,pageView:!0,pageSize:{width:i._document.body.offsetWidth,height:i._document.body.offsetHeight},screenSize:{width:i._window.screen.width,height:i._window.screen.height},userAgent:i._navigator.userAgent}};setTimeout(function(){return r(a)},1)}var s=i._window.onpopstate;i._window.onpopstate=function(){var t=e.href;if(r({category:"navigation",payload:{to:t,from:n}}),n=t,s)return s.apply(history,arguments)},o.fill(history,"pushState",function(t){return function(){for(var e=[],o=0;o<arguments.length;o++)e[o]=arguments[o];var i=e.length>2?e[2]:void 0;if(i){r({category:"navigation",payload:{to:i,from:n}}),n=i}return t.apply(history,e)}},t.__wrappedBuiltins)})}}},function(t,e,n){"use strict";function r(t,e){return function(n){if(u=null,c!==n){c=n;var r=null;try{r=a.htmlTreeAsString(n.target)}catch(t){r="<unknown>"}var o={event:t,path:r};"click"!==t&&"touchstart"!==t||(o.pos={x:n.pageX,y:n.pageY},o.pageSize={width:s._document.body.offsetWidth,height:s._document.body.offsetHeight}),e({category:"ui.events",payload:o})}}}function o(t){return function(e){var n;try{n=e.target}catch(t){return}var o=n&&n.tagName;if(o&&("INPUT"===o||"TEXTAREA"===o||n.isContentEditable)){var i=u;i||r("input",t)(e),clearTimeout(i),u=setTimeout(function(){u=null},l)}}}Object.defineProperty(e,"__esModule",{value:!0});var i=n(1),a=n(0),s=n(2),u=null,c=null,l=1e3;e.default=function(){if(s._document&&s.hasDocument)return new i.default("breadcrumb.DOMEvents",function(t){s._document.addEventListener?(s._document.addEventListener("click",r("click",t),!1),s._document.addEventListener("keypress",o(t),!1)):(s._document.attachEvent("onclick",r("click",t),!1),s._document.attachEvent("onkeypress",o(t),!1))})}},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=n(1),o=n(4);e.default=function(){return new r.default("exception",function(t){o.report.subscribe(function(e){t({type:"error",category:"error",payload:e})})})}},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=n(1);e.default=function(){return new r.default("performance",function(t){window.onload=function(){var e=window.performance.timing,n=window.performance.navigation;e.loadEventEnd-e.navigationStart<0?setTimeout(function(){e=window.performance.timing,t({category:"performance",payload:{timing:e,navigation:n}})},0):t({category:"performance",payload:{timing:e,navigation:n}})}})}},function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=n(2),o=n(0),i=n(18),a=i.version,s=function(){function t(){this.appId="",this.domain="",this.tag="",this.osVersion="",this.osBuild="";var t=window.localStorage.predemUuid;void 0!==t&&t.length>0?this.uuid=t:(t=this.generateUUID(),window.localStorage.predemUuid=t,this.uuid=t);var e=this.getExplorerInfo(),n="";if(e!=={}&&(n=e.version)){var r=n.split(".");1===r.length?this.osVersion=r[0]:r.length>=2&&(this.osVersion=r[0],this.osBuild=r[1])}}return t.prototype.init=function(t,e){this.appId=t,this.domain=e},t.prototype.setTag=function(t){this.tag=t},t.prototype.sendEventData=function(t,e){var n=this.postDataUrl(this.domain,"event",this.appId),o=this.initCustomEvent(this.appId,this.tag,t,e);return r._window._origin_fetch(n,{method:"POST",headers:{"Content-Type":"application/json"},body:JSON.stringify(o)})},t.prototype.push=function(t){var e=this,n=t.category;t instanceof Array&&(n="network");var r=this.postDataUrl(this.domain,n,this.appId);if(t instanceof Array){var o=[];return t.map(function(t){var n=e.initNetworkData(e.appId,t,e.tag);o.push(n)}),this.getRequestFun(r,n,o.join("\n"))}var i=void 0;return i="error"===t.category?this.initErrorData(this.appId,t,this.tag):this.initPerformance(this.appId,t,this.tag),this.getRequestFun(r,n,i)},t.prototype.postDataUrl=function(t,e,n){switch(e){case"error":return t+"/v1/"+n+"/crashes/w";case"performance":return t+"/v1/"+n+"/web/performance/w";case"network":return t+"/v1/"+n+"/http-stats/w";case"event":return t+"/v1/"+n+"/events"}return""},t.prototype.initCustomEvent=function(t,e,n,r){return{app_id:t,app_bundle_id:window.location.host,app_name:"",app_version:"",device_model:this.getDeviceModel(),manufacturer:"",device_id:"",os_platform:"web",os_version:this.osVersion,os_build:this.osBuild,sdk_version:a,sdk_id:this.uuid,tag:e,type:"custom",name:n,content:r}},t.prototype.initPerformance=function(t,e,n){var r=e.payload.timing,o=e.payload.navigation,i=JSON.stringify(r),a={app_id:t,tag:n,domain:window.location.host,path:window.location.pathname,ua:this.getDeviceModel(),platform:"web",navigationType:o.type,redirectCount:o.navigation};return Object.assign(a,JSON.parse(i),{triggerTime:e.timestamp})},t.prototype.initNetworkData=function(t,e,n){var r=200!==e.payload.status_code?e.payload.status_code:0,i=200!==e.payload.status_code?e.payload.responseText:"",s=e.payload.contentLength?e.payload.contentLength:0,u=e.payload.ResponseTimeStamp?e.payload.ResponseTimeStamp:0,c={AppBundleId:window.location.host,AppName:"",AppVersion:"",DeviceModel:this.getDeviceModel(),OsPlatform:"web",OsVersion:this.osVersion,OsBuild:this.osBuild,SdkVersion:a,SdkId:this.uuid,DeviceId:"",Tag:n,Manufacturer:"",Domain:o.getDominFromUrl(e.payload.url).domain,Path:o.getDominFromUrl(e.payload.url).path,Method:e.payload.method,HostIP:"",StatusCode:e.payload.status_code,StartTimestamp:e.timestamp,ResponseTimeStamp:u,EndTimestamp:e.timestamp+e.payload.duration,DnsTime:0,DataLength:s,NetworkErrorCode:r,NetworkErrorMsg:i},l=[];for(var f in c)0===c[f]?l.push(0):c[f]&&""!==c[f]&&null!==c[f]?l.push(c[f]):l.push("-");return l.join("\t")},t.prototype.initErrorData=function(t,e,n){var r=JSON.stringify(e.payload.stack);return{app_id:t,app_bundle_id:window.location.host,app_name:"",app_version:"",device_model:this.getDeviceModel(),os_platform:"web",os_version:this.osVersion,os_build:this.osBuild,sdk_version:a,sdk_id:this.uuid,device_id:"",tag:n,report_uuid:"",crash_log_key:r,manufacturer:"",start_time:0,crash_time:e.timestamp,mode:e.payload.mode,message:e.payload.message}},t.prototype.getDeviceModel=function(){return navigator.userAgent},t.prototype.getErrorRequesFunc=function(t,e){return r._window._origin_fetch(t,{method:"POST",headers:{"Content-Type":"application/json"},body:JSON.stringify(e)})},t.prototype.getPerformanceRequesFunc=function(t,e){return r._window._origin_fetch(t,{method:"POST",headers:{"Content-Type":"application/json"},body:JSON.stringify(e)})},t.prototype.getNetworkRequesFunc=function(t,e){return r._window._origin_fetch(t,{method:"POST",headers:{"Content-Type":"text/plain"},body:e})},t.prototype.getRequestFun=function(t,e,n){return"error"===e?this.getErrorRequesFunc(t,n):"network"===e?this.getNetworkRequesFunc(t,n):this.getPerformanceRequesFunc(t,n)},t.prototype.getExplorerInfo=function(){var t=window.navigator.userAgent.toLowerCase();if(t.indexOf("msie")>=0){var e=t.match(/msie ([\d.]+)/)[1];return{type:"IE",version:e}}if(t.indexOf("firefox")>=0){var e=t.match(/firefox\/([\d.]+)/)[1];return{type:"Firefox",version:e}}if(t.indexOf("chrome")>=0){var e=t.match(/chrome\/([\d.]+)/)[1];return{type:"Chrome",version:e}}if(t.indexOf("opera")>=0){var e=t.match(/opera.([\d.]+)/)[1];return{type:"Opera",version:e}}if(t.indexOf("safari")>=0){var e=t.match(/version\/([\d.]+)/)[1];return{type:"Safari",version:e}}return{}},t.prototype.generateUUID=function(){var t=(new Date).getTime();return"xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx".replace(/[xy]/g,function(e){var n=(t+16*Math.random())%16|0;return t=Math.floor(t/16),("x"==e?n:3&n|8).toString(16)})},t}(),u=new s;e.default=u},function(t,e){t.exports={name:"pre-dem-web",version:"1.0.6",license:"MIT",main:"dist/pre-dem-web.js",scripts:{clean:"rimraf build",check:"tslint -c ./tslint.json './src/**/*.ts*'",dev:"NODE_ENV=development && node --max_old_space_size=8000 node_modules/webpack-dev-server/bin/webpack-dev-server.js --config webpack.config.js --inline --progress --colors  --content-base --profile --display-modules build",build:"npm run clean && webpack --config webpack.config.js --profile --display-modules --progress --colors"},devDependencies:{tracekit:"^0.4.5","@types/node":"^8.0.24","awesome-typescript-loader":"^3.2.3","source-map-loader":"^0.2.1",typescript:"^2.4.2",ava:"^0.20.0",webpack:"^3.5.5",rimraf:"^2.5.3"},keywords:["exceptions","debugging","logging","errors","dem"],types:"types/dem.d.ts",dependencies:{platform:"^1.3.4"}}}])});