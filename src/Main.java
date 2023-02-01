public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Epic epic1 = new Epic();
        epic1.setName("Написать фин задание 3-го спринта");
        epic1.setDescription("3- ссрпинт приведет нас к пониманию ООП");
        epic1.setStatus(epic1.getStatusNew());

        Subtask subtask1 = new Subtask();
        subtask1.setName("Помучится самостоятельно");
        subtask1.setDescription("Это будет долгий и мучительный процес");
        subtask1.setStatus(subtask1.getStatusNew());

        Subtask subtask2 = new Subtask();
        subtask2.setName("Посмотреть вебинар");
        subtask2.setDescription("Второе дыхание");
        subtask2.setStatus(subtask2.getStatusNew());

        manager.createEpic(epic1);
        epic1.createSubtask(subtask1);
        epic1.createSubtask(subtask2);

        Epic epic2 = new Epic();
        epic2.setName("Отправить фин задание");
        epic2.setDescription("Надежда умирает последней");
        epic2.setStatus(epic2.getStatusNew());

        Subtask subtask11 = new Subtask();
        subtask11.setName("Архивировать файл");
        subtask11.setDescription("Не забыть все проверить перед архивированием");
        subtask11.setStatus(subtask11.getStatusNew());

        manager.createEpic(epic2);
        epic2.createSubtask(subtask11);

        System.out.println(epic1);
        System.out.println(epic1.subtask);
        System.out.println(epic2);
        System.out.println(epic2.subtask);

        System.out.println("...................................................");
        subtask1.setStatus(subtask1.getStatusDone());
        subtask2.setStatus(subtask2.getStatusDone());
        manager.statusEpic(epic1);
        System.out.println(epic1);
        System.out.println(epic1.subtask);

        System.out.println("...................................................");
        subtask11.setStatus(subtask11.getStatusDone());
        manager.statusEpic(epic2);
        System.out.println(epic2);
        System.out.println(epic2.subtask);

        System.out.println("...................................................");
        manager.deletTask(epic1);
        System.out.println(manager.getTaskEpic());

        System.out.println("...................................................");
        manager.deleteSubtask(epic2,subtask11);
        System.out.println();
        System.out.println(epic2);
        System.out.println(epic2.subtask);
    }

}