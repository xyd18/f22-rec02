interface CartesianPoint extends Point {
    x: number,
    y: number
}

function newCartesianPoint (x: number, y: number): CartesianPoint {
    return {
        x,
        y,

        getX: function () : number {
            return x;
        },
        getY: function () : number {
            return y;
        }
    }
}

export { CartesianPoint, newCartesianPoint }