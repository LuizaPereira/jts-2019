var gulp = require('gulp');
    imagemin = require('gulp-imagemin');

gulp.task('build-img', function(){
    gulp.src('src/images')
    .pipe(imagemin())
    .pipe(gulp.dest('src/images'));
})

