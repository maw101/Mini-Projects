class Media {
  constructor(title) {
    this._title = title;
    this._isCheckedOut = false;
    this._ratings = [];
  }
  
  get title() {
    return this._title;
  }
  get isCheckedOut() {
    return this._isCheckedOut;
  }
  get ratings() {
    return this._ratings;
  }
  set isCheckedOut(status) {
    this._isCheckedOut = status;
  }
  
  toggleCheckOutStatus() {
    this._isCheckedOut = !this._isCheckedOut;
  }
  
  addRating(rating) {
    this._ratings.push(rating);
  }
  
  getAverageRating() {
    return (this._ratings.reduce((currentSum, rating) => currentSum + rating, 0)) / this._ratings.length;
  }
}

class Book extends Media {
  constructor(author, title, pages) {
    super(title);
    this._author = author;
    this._pages = pages;
  }
  
  get author() {
    return this._author;
  }
  get pages() {
    return this._pages;
  }
}

class Movie extends Media {
  constructor(director, title, runTime) {
    super(title);
    this._director = director;
    this._runTime = runTime;
  }
  
  get director() {
    return this._director;
  }
  get runTime() {
    return this._runTime;
  }
}

const myFirstBook = new Book('Author Name', 'My First Book', 123);
myFirstBook.toggleCheckOutStatus();

console.log(myFirstBook.isCheckedOut);

myFirstBook.addRating(1);
myFirstBook.addRating(2);
myFirstBook.addRating(3);

console.log(myFirstBook.getAverageRating());


const myFirstMovie = new Movie('Director Name', 'My First Movie', 321);
myFirstMovie.toggleCheckOutStatus();

console.log(myFirstMovie.isCheckedOut);

myFirstMovie.addRating(5);
myFirstMovie.addRating(4);
myFirstMovie.addRating(3);

console.log(myFirstMovie.getAverageRating());