import java.util.Scanner;

public class Intersection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        //1
        if (x1 < x2) {
            if (y1 > y2) {
                if (x1 < y2) {
                    if (y1 > x2) {
                        System.out.println(x2 + " " + y2);
                    }
                }
            }

            //2
            else if (y1 == y2) {
                if (x1 < y2) {
                    if (y1 > x2) {
                        System.out.println(x2 + " " + y2);
                    }
                }
            }

            //8
            else if (y1 < y2) {
                if (x1 < y2) {
                    if (y1 > x2) {
                        System.out.println(x2 + " " + y1);
                    }

                    //10
                    else if (y1 == x2) {
                        System.out.println(y1);
                    }

                    //12
                    else if (y1 < x2) {
                        System.out.println("Пересечения нет");
                    }
                }
            }
        }

        //3
        else if (x1 == x2) {
            if (y1 > y2) {
                if (x1 < y2) {
                    if (y1 > x2) {
                        System.out.println(x2 + " " + y2);

                    }
                }
            }

            //4
            else if (y1 == y2) {
                System.out.println(x1 + " " + y1);
            }

            //5
            else if (y1 < y2) {
                if (x1 < y2) {
                    if (y1 > x2) {
                        System.out.println(x1 + " " + y1);
                    }
                }
            }
        }

        //6
        else if (x1 > x2) {
            if (y1 == y2) {
                if (x1 < y2) {
                    if (y1 > x2) {
                        System.out.println(x1 + " " + y1);
                    }
                }
            }

            //7
            else if (y1 < y2) {
                if (x1 < y2) {
                    if (y1 > x2) {
                        System.out.println(x1 + " " + y1);
                    }
                }
            }

            //9
            else if (y1 > y2) {
                if (x1 < y2) {
                    if (y1 > x2) {
                        System.out.println(x1 + " " + y2);
                    }

                    //11
                    else if (x1 == y2) {
                        System.out.println(x1);
                    }
                }

                //13
                else if (x1 > y2) {
                    if (y1 > x2) {
                        System.out.println("Пересечения нет");
                    }
                }

            }
        }

        //14
        if (x1 == y2) {
            if (y1 > x2) {
                System.out.println(x1);
            }
        }

        //chat
        if (x1 <= y2 && y1 >= x2) {
            int start = Math.max(x1, x2);
            int end = Math.min(y1, y2);
            if (start == end) {
                System.out.println(start);
            } else {
                System.out.println(start + " " + end);
            }
        } else {
            System.out.println("Пересечения нет");
        }
    }
}
