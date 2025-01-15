package homework30;
/*
В методе main():
    Создайте объект Post.
    Поставьте несколько лайков, добавьте пару комментариев и выведите информацию
    (количество лайков и список комментариев).
 */
public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        // Ставим лайки
        post.like();
        post.like();

        // Добавляем комментарии
        post.addComment("Первый комментарий!");
        post.addComment("Второй комментарий!");

        // Вывод информации
        System.out.println("Количество лайков: " + post.getLikesCount());
        System.out.println("Комментарии: " + post.getComments());
    }
} // klass ended
