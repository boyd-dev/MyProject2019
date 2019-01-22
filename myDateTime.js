
exports.myDateTime = function () {
    let d;
    d = new Date();

    let mm = d.getMonth() < 9 ? "0" + (d.getMonth() + 1) : (d.getMonth() + 1);
    let dd = d.getDate() < 10 ? "0" + d.getDate() : d.getDate();
    let str = d.getFullYear() + "-" + mm + "-" + dd;

    return str;
};

