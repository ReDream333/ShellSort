package Test;

public @interface Info {

    /* TODO история
Умный мужик Дональд Шелл аж в 1959-м году заметил, что в алгоритме вставками дороже
всего обходятся случаи, когда элемент возвращается очень далеко к началу массива: на каком-то
проходе мы вернем элемент к началу на пару позиций, а на другом проходе почти через весь массив
к началу – далеко и долго. Нельзя ли это сделать сразу, прыгая через несколько элементов?
И такой способ он нашел. Заключается он в последовательном выполнении особых частичных сортировок,
называемых в общем виде d-sort или, у Седжвика, h-sort (подозреваю, h означает hop - прыжок).
 */


/* TODO описание
Сортировка Шелла — это вариант сортировки вставкой.
Но в сортировке вставкой мы перемещаем элементы только на одну позицию вперед.
Когда необходимо переместить элемент далеко, выполняется много перемещений.

Суть сортировки Шелла состоит в том, чтобы менять местами элементы,
расположенные далеко друг от друга. При использовании этого алгоритма мы делаем массив
h-сортированным для большого значения h. Продолжаем уменьшать значение h, пока оно не
станет равным 1. Массив называется h-сортированным, если все подмассивы каждого h-го
элемента отсортированы.
 */

/*TODO Алгоритм сортировки Шелла
Инициализируем значение размера части (h).
Делим массив на меньшие части с одинаковым расстоянием до h.
Сортируем эти части с помощью сортировки вставкой.
Повторяем шаг 1, пока список не будет отсортирован.
 */

/*TODO Сложность сортировки Шелла
T = O(n^2)
M = О(1)

Временная сложность: O(n^2). В этом алгоритме используется исходная последовательность Шелла,
в которой на каждой итерации интервал уменьшается наполовину.
Существует много других способов уменьшения интервала, которые позволяют повысить производительность
алгоритма.

Сложность сортировки Шелла в худшем случае составляет O(n^2).
Если исходный массив уже отсортирован, то общее число сравнений равно размеру данного массива.
Поэтому сложность в лучшем случае: O(n log n). Сложность сортировки Шелла в среднем случае:
O(n log n).

Независимо от последовательности интервалов,
сложность по памяти в сортировке Шелла составляет О(1).
 */

}
