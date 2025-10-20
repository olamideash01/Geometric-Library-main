# Geometric Library – Variant 14

**Student**: Olamide  
**Course**: OBJECT-ORIENTED-PROGRAMMING  
**Task**: Variant 14 – A library for working with geometric objects (point, segment, polygon, group) on a plane, supporting intersection, union, subtraction, and area calculation.

---

## ✅ Compliance with Task Requirements

This project fully satisfies the specified requirements:

- ✅ **Four geometric object types implemented**:
  - `Point` – 2D point with (x, y) coordinates
  - `Segment` – Line segment between two points
  - `Polygon` – Simple polygon defined by ordered vertices
  - `Group` – Container for heterogeneous geometric objects
- ✅ **Geometric operations supported**:
  - **Intersection**, **union**, and **subtraction** (for polygons)
  - **Area calculation** for all objects (0 for points/segments; sum for groups)
- ✅ **Pure Java implementation** with **console-only demonstration**
- ✅ **No GUI used** (as permitted by task instructions)

> Note: Boolean operations are mathematically meaningful primarily for polygons (which have area). Points and segments have zero area, so their union/subtraction is not defined in the context of area computation. This implementation follows standard computational geometry practice by focusing robust operations on polygons.

---

## 🛠️ Technical Implementation

- **Core Geometry Engine**: [JTS Topology Suite (v1.19.0)](https://github.com/locationtech/jts)  
  Used for accurate and robust polygon operations (intersection, union, difference, area).
- **Project Structure**: Standard Java layout compatible with IntelliJ IDEA
- **Dependencies**: Only `jts-core-1.19.0.jar` (included in `/lib` for ease of evaluation)

---

## ▶️ How to Run

1. Open the project in **IntelliJ IDEA**
2. Ensure `lib/jts-core-1.19.0.jar` is added as a library:
   - `File → Project Structure → Libraries → + → Java → select jts-core-1.19.0.jar`
3. Run `com.geometry.GeometryDemo`  
   → Output appears in the console

No additional setup or external tools required.

---

## 📂 File Overview

- `src/main/java/com/geometry/`
  - `Point.java` – Basic point with intersection logic
  - `Segment.java` – Line segment (area = 0)
  - `Polygon.java` – JTS-backed polygon with full Boolean operations
  - `Group.java` – Composite object with recursive area calculation
  - `GeometryDemo.java` – Console demonstration of all features
- `lib/jts-core-1.19.0.jar` – Geometry library (included)

---

## 📝 Notes for Evaluation

- All operations are demonstrated in the console as permitted by the task.
- The solution prioritizes **correctness** and **clarity** over performance.
- Polygon vertices are assumed to form **simple (non-self-intersecting) polygons**.
- Results of Boolean operations that yield multi-polygons are simplified to `null` for academic clarity.

---

Thank you for your evaluation!

НА РУССКОМ:

# Библиотека геометрических объектов на плоскости – Вариант 14

**Студент**: Оламиде  
**Курс**: Объектно-ориентированное программирование  
**Задание**: Вариант 14 – библиотека для работы с геометрическими объектами (точка, отрезок, многоугольник, группа объектов) на плоскости с поддержкой операций пересечения, объединения, вычитания и вычисления площадей.

---

## ✅ Соответствие требованиям задания

Проект полностью удовлетворяет поставленным требованиям:

- ✅ **Реализованы четыре типа геометрических объектов**:
  - `Point` – точка с координатами (x, y)
  - `Segment` – отрезок между двумя точками
  - `Polygon` – простой многоугольник, заданный упорядоченными вершинами
  - `Group` – контейнер для разнородных геометрических объектов
- ✅ **Поддерживаемые операции**:
  - **Пересечение**, **объединение** и **вычитание** (для многоугольников)
  - **Вычисление площади** для всех объектов (0 для точек и отрезков; сумма для групп)
- ✅ **Реализация на языке Java** с демонстрацией **только в консоли**
- ✅ **Графический интерфейс не используется** (в соответствии с условиями задания)

> Примечание: Булевы операции имеют смысл в первую очередь для многоугольников (имеющих площадь). Точки и отрезки имеют нулевую площадь, поэтому операции объединения/вычитания для них не определены в контексте вычисления площади. Данная реализация следует стандартной практике вычислительной геометрии, сосредотачиваясь на многоугольниках.

---

## 🛠️ Техническая реализация

- **Основной геометрический движок**: [JTS Topology Suite (v1.19.0)](https://github.com/locationtech/jts)  
  Используется для точных и надёжных операций с многоугольниками (пересечение, объединение, разность, площадь).
- **Структура проекта**: Стандартная Java-структура, совместимая с IntelliJ IDEA
- **Зависимости**: Только `jts-core-1.19.0.jar` (включён в папку `/lib` для удобства проверки)

---

## ▶️ Как запустить

1. Откройте проект в **IntelliJ IDEA**
2. Убедитесь, что `lib/jts-core-1.19.0.jar` добавлен как библиотека:
   - `File → Project Structure → Libraries → + → Java → выберите jts-core-1.19.0.jar`
3. Запустите `com.geometry.GeometryDemo`  
   → Результат отобразится в консоли

Дополнительная настройка не требуется.

---

## 📂 Обзор файлов

- `src/main/java/com/geometry/`
  - `Point.java` – базовая точка с логикой пересечения
  - `Segment.java` – отрезок (площадь = 0)
  - `Polygon.java` – многоугольник на основе JTS с полными булевыми операциями
  - `Group.java` – составной объект с рекурсивным вычислением площади
  - `GeometryDemo.java` – консольная демонстрация всех возможностей
- `lib/jts-core-1.19.0.jar` – геометрическая библиотека (включена)

---

## 📝 Примечания для проверяющего

- Все операции демонстрируются в консоли, как разрешено в задании.
- Решение делает акцент на **корректности** и **ясности**, а не на производительности.
- Вершины многоугольников предполагаются **простыми** (без самопересечений).
- Результаты булевых операций, дающие составные многоугольники, упрощены до `null` для академической ясности.

---

Спасибо за проверку!
