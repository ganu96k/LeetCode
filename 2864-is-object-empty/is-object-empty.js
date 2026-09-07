/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {

var res = Object.keys(obj);
  return res.length ? false : true ;    
    // return Object.keys(obj).length === 0;
};